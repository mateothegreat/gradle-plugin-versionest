package matthewdavis.io.plugins.versionest;

import matthewdavis.io.plugins.versionest.tasks.*;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Semantic version plugin for gradle.
 */
public class VersionestPlugin implements Plugin<Project> {

    /**
     * Add gradle tasks.
     *
     * @param project Project passed in by gradle.
     */
    @Override
    public void apply(Project project) {

        project.getExtensions().create("versionest", VersionestExtension.class);

        project.getTasks().create("getCurrentVersion", GetVersion.class).setGroup("versionest");
        project.getTasks().create("createVersionFile", CreateVersionFile.class).setGroup("versionest");
        project.getTasks().create("bumpMajorVersion", BumpMajorVersion.class).setGroup("versionest");
        project.getTasks().create("bumpMinorVersion", BumpMinorVersion.class).setGroup("versionest");
        project.getTasks().create("bumpPatchVersion", BumpPatchVersion.class).setGroup("versionest");

    }

}
