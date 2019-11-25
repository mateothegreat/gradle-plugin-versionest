package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;

/**
 * Gradle task for bumping the minor version.
 */
public class BumpMinorVersion extends DefaultTask {

    /**
     * Gradle task for bumping the minor version by reading the current version
     * and incrementing it by one then writing it out to the version.properties file.
     *
     * @throws IOException Throws exception when version.properties cannot be found.
     */
    @TaskAction
    public void bumpMinorVersion() throws IOException {

        Version version = GetVersion.getCurrentVersionFromFile();

        version.setMinor(version.getMinor() + 1);

        CreateVersionFile.writeFile(version);

        System.out.println("Version bumped! " + version);

    }

}
