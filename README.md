## Multiple Library Bintray Release
A demo project which illustrates Bintray release configuration for multiple library modules.
For example, you develop Java and Android library which includes sub-libraries and they are built by Gradle.

### Let's dive into our journey
We are planned to build a world-class manga(漫画) studio. Firstly, we create a `manga` module which serves as a primary library
and it is written purely in Java.  

After that, we utilize it to produce concrete mangas. Our first masterpiece is `Doraemon` and we would like to our partners (Android developers)
to include on their apps. So, we develop Android `doraemon` library which depends on `manga`.

Our development process is already completed and it is ready to deliver to our partners. Because Android developers use Maven repository,
so we decide to distribute all libraries on jCenter (one of popular Maven repository hosts).

To distribute a Java or Android library on Bintray and Jcenter, we already know and it is well-written [in this article](https://android.jlelse.eu/how-to-distribute-android-library-in-a-convenient-way-d43fb68304a7).

However, our manga studio are growing quickly, and we plan to produce 2 mangas everyday. So,**we need to find out how to distribute
hundreds or thousands mangas in an easier and more effortless way.**

Finally, we got the solution and successfully distributed them on Bintray. [ ![Download](https://api.bintray.com/packages/quangnguyen/maven/manga/images/download.svg) ](https://bintray.com/quangnguyen/maven/manga/_latestVersion).  
If you are in the same situation, let's check it out.  

Besides, it could be optimized more. For example, we currently put them all in one repository on Bintray, so all mangas are quite coupled.
A little bit change should be made to separate all mangas into their own repositories.

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
