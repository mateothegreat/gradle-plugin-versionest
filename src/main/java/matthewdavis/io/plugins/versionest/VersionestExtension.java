package matthewdavis.io.plugins.versionest;

import matthewdavis.io.plugins.versionest.tasks.GetVersion;

import java.io.IOException;

public class VersionestExtension {

    public Version getVersion() throws IOException {

        return GetVersion.getCurrentVersionFromFile();

    }

}
