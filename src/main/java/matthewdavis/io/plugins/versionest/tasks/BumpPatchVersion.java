package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;

public class BumpPatchVersion extends DefaultTask {

    @TaskAction
    public void bumpPatchVersion() throws IOException {

        Version version = GetVersion.getCurrentVersionFromFile();

        version.setPatch(version.getPatch() + 1);

        CreateVersionFile.writeFile(version);

        System.out.println("Version bumped! " + version);

    }

}
