## Multiple Library Bintray Release
A demo project which illustrates Bintray release configuration for multiple library modules.
For example, you develop Java and Android library which includes sub-libraries and they are built by Gradle.

#### Test
```
./gradlew test
```

#### Build (Assemble + Test)
```
./gradlew build
```

#### Release new version on Bintray
```
./gradlew bintrayUpload
```
or for a specific module
```
./gradlew *moduleName*:bintrayUpload
```
