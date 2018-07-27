## Multiple Library Bintray Release
A demo project which illustrates how to a distribute Java/Android multiple-module library on Bintray easily.  

The steps are explained fully at [my blog post](https://blog.mindorks.com/distribute-multiple-module-library-on-bintray-for-java-and-android-developers-212216bc1aa7).

### Steps
1. Copy [`jcenter` folder](/jcenter) and [`release-bintray.gradle` file](/release-bintray.gradle) into your project  
2. Add the following line into each module's `build.gradle` file  
```gradle
// ...
apply from: rootProject.file('release-bintray.gradle')
```  
For exampke, for module [`manga`](/manga/build.gradle) in this project.  
3. Set your Bintray credentials
You need to put your own Bintray account credentials inside `local.properties` file (which is not tracked by version control).
```gradle
bintray.user=your_username
bintray.apikey=your_api_key (i.e: adfasdf342342j34lba84a25f8c3)
bintray.gpg.password=your_gpg_password
```  
4. In each module, update its Bintray information in `gradle.properties`
For example, for module [`manga`](https://github.com/quangctkm9207/multi-library-bintray/tree/master/manga) in this project.
```
POM_NAME=Manga
POM_DESCRIPTION=Define general mange character
POM_BINTRAY_NAME=com.quangnguyen.manga:manga
POM_ARTIFACT_ID=manga
POM_PACKAGING=jar
POM_VERSION=1.1.0
```  
5. Run script from command line
- To publish all modules at the same time
```
./gradlew bintrayUpload
```
- To publish a specific module separately
```
./gradlew *moduleName*:bintrayUpload
```
