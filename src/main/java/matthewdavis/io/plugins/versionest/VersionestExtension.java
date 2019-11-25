package matthewdavis.io.plugins.versionest;

import matthewdavis.io.plugins.versionest.tasks.GetVersion;

import java.io.IOException;

/**
 * Gradle Extension used to expose the current version object.
 */
public class VersionestExtension {

    /**
     * Retrieve the current version.
     *
     * @return Returns {@link Version} object.
     *
     * @throws IOException Throws an exeption when version.properties cannot be found.
     */
    public Version getVersion() throws IOException {

        return GetVersion.getCurrentVersionFromFile();

    }

}
