package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;

public class BumpMinorVersion extends DefaultTask {

    @TaskAction
    public void bumpMinorVersion() throws IOException {

        Version version = GetVersion.getCurrentVersionFromFile();

        version.setMinor(version.getMinor() + 1);

        CreateVersionFile.writeFile(version);

        System.out.println("Version bumped! " + version);

    }

}
