package matthewdavis.io.plugins.versionest;

import lombok.Data;

/**
 * Object to hold semantic version.
 */
@Data
public class Version {

    /**
     * Major verison (1.2.3, being 1)
     */
    private int major = 0;

    /**
     * Minor verison (1.2.3, being 2)
     */
    private int minor = 0;
    /**
     * Patch verison (1.2.3, being 3)
     */
    private int patch = 0;

    /**
     * Semantic version string.
     *
     * @return Returns semantic version string.
     */
    public String toString() {

        return major + "." + minor + "." + patch;

    }

}
