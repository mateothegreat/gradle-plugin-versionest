# versionest gradle plugin

Auto-magically handles version based on semantic versioning.
Version information is stored and read from "versioning.properties".
 
# Setup:

1. Configure build.gradle with the following at a minimum:

```groovy
apply from: 'versioning.gradle'
version = ext.getVersion()
```
2. Create a file called "version.properties" with the following three lines:

 ```properties
MAJOR=1
MINOR=2
PATCH=3
```

Usage:

```bash
 $ gradle bump major   (i.e.: 1.0.0 to 2.0.0)
 $ gradle bump minor   (i.e.: 1.1.0 to 1.2.0)
 $ gradle bump patch   (i.e.: 1.0.1 to 1.0.2)
```
