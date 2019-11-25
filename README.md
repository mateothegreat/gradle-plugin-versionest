# versionest gradle plugin

Auto-magically handles version based on semantic versioning.
Version information is stored and read from "versioning.properties".
 
# Setup:

1. Configure build.gradle with the following at a minimum:

```groovy
apply from: 'versioning.gradle'
version = ext.getVersion()
```
2. Create a file called "version.properties" with the following line:

 ```properties
0.0.0
```

Usage:

```bash
 $ gradle bumpMajorVersion   (i.e.: 1.0.0 to 2.0.0)
 $ gradle bumpMinorVersion   (i.e.: 1.1.0 to 1.2.0)
 $ gradle bumpPatchVersion   (i.e.: 1.0.1 to 1.0.2)
```
