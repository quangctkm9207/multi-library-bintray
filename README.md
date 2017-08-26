## Multiple Library Bintray Release
A demo project which illustrates Bintray release configuration for multiple library modules.
For example, you develop Java and Android library which includes sub-libraries and they are built by Gradle.

It has been released successfully on Bintray, check it out at [ ![Download](https://api.bintray.com/packages/quangnguyen/maven/manga/images/download.svg) ](https://bintray.com/quangnguyen/maven/manga/_latestVersion).  

### Command

#### Clean
```
./gradlew clean
```

#### Build (Assemble + Test)
```
./gradlew build
```

#### Release new version on Bintray
Firstly, you need to put your own Bintray account credentials inside `local.properties` file (which is not tracked by version control).
```gradle
bintray.user=your_username
bintray.apikey=your_api_key (i.e: adfasdf342342j34lba84a25f8c3)
bintray.gpg.password=your_gpg_password
```  
Now, it is ready for uploading.
```
./gradlew bintrayUpload
```
or for a specific module
```
./gradlew *moduleName*:bintrayUpload
```
