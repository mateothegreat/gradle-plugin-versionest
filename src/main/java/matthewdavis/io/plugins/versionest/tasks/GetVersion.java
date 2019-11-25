package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Handles retrieving the semantic version from a version.properties file.
 */
public class GetVersion extends DefaultTask {

    /**
     * Returns a {@link Version} object which is parsed from the version.properties file.
     *
     * @return Semantic version object ie. ("1.2.3").
     *
     * @throws IOException Throws when version.properties cannot be found.
     */
    public static Version getCurrentVersionFromFile() throws IOException {

        String file = Files.readString(Path.of("version.properties"));

        Pattern pattern = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)");
        Matcher matcher = pattern.matcher(file);

        matcher.find();

        Version version = new Version();

        if (matcher.groupCount() == 3) {

            version.setMajor(Integer.parseInt(matcher.group(1)));
            version.setMinor(Integer.parseInt(matcher.group(2)));
            version.setPatch(Integer.parseInt(matcher.group(3)));

        } else {

            System.out.println("ERROR: invalid format for version.properties");
        }

        return version;

    }


    /**
     * Returns and outputs the current version parsed from the version.properties file.
     *
     * @return Semantic version string ie. ("1.2.3").
     *
     * @throws IOException Throws when version.properties cannot be found.
     */
    @TaskAction
    public String getCurrentVersion() throws IOException {

        Version version = getCurrentVersionFromFile();

        System.out.println(version);

        return version.toString();

    }

}
