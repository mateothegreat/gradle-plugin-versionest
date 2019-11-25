package matthewdavis.io.plugins.versionest;

import matthewdavis.io.plugins.versionest.tasks.*;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Semantic version plugin for gradle.
 */
public class VersionestPlugin implements Plugin<Project> {

    /**
     * Add gradle tasks & extension.
     *
     * @param project Project passed in by gradle.
     */
    @Override
    public void apply(Project project) {

        //
        // Add the "versionest" extension so that the current version
        // can be read as a variable into build.gradle.
        //
        project.getExtensions().create("versionest", VersionestExtension.class);

        //
        // Add tasks.
        //
        project.getTasks().create("getCurrentVersion", GetVersion.class).setGroup("versionest");
        project.getTasks().create("createVersionFile", CreateVersionFile.class).setGroup("versionest");
        project.getTasks().create("bumpMajorVersion", BumpMajorVersion.class).setGroup("versionest");
        project.getTasks().create("bumpMinorVersion", BumpMinorVersion.class).setGroup("versionest");
        project.getTasks().create("bumpPatchVersion", BumpPatchVersion.class).setGroup("versionest");

    }

}
