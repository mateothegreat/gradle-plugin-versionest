package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateVersionFile extends DefaultTask {

    /**
     * Writes semantic version string to version.properties.
     *
     * @param version Version object
     *
     * @throws IOException Throws exception when version.properties cannot be found.
     */
    public static void writeFile(Version version) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("version.properties"));

        writer.write(version.getMajor() + "." + version.getMinor() + "." + version.getPatch());
        writer.close();

    }

    /**
     * Gradle task for creating the version.properties file with the defaults.
     *
     * @throws IOException Throws exception when version.properties cannot be found.
     */
    @TaskAction
    public void createVersionFile() throws IOException {

        writeFile(new Version());

        System.out.println("version.properties created!");

    }

}
