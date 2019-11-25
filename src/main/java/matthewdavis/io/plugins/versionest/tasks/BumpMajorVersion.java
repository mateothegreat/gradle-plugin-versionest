package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;

/**
 * Gradle task for bumping the major version.
 */
public class BumpMajorVersion extends DefaultTask {

    /**
     * Gradle task for bumping the major version by reading the current version
     * and incrementing it by one then writing it out to the version.properties file.
     *
     * @throws IOException Throws exception when version.properties cannot be found.
     */
    @TaskAction
    public void bumpMajorVersion() throws IOException {

        Version version = GetVersion.getCurrentVersionFromFile();

        version.setMajor(version.getMajor() + 1);

        CreateVersionFile.writeFile(version);

        System.out.println("Version bumped! " + version);

    }

}
