package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;

public class BumpMajorVersion extends DefaultTask {

    @TaskAction
    public void bumpMajorVersion() throws IOException {

        Version version = GetVersion.getCurrentVersionFromFile();

        version.setMajor(version.getMajor() + 1);

        CreateVersionFile.writeFile(version);

        System.out.println("Version bumped! " + version);

    }

}
