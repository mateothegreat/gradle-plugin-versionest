package matthewdavis.io.plugins.versionest;

import matthewdavis.io.plugins.versionest.tasks.GetVersion;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class VersionestPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        project.getTasks().create("getCurrentVersion", GetVersion.class);

    }

}
