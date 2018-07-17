1. Change Gradle to `3.1.3`
2. App `build.gradle`:
```
android {
compileSdkVersion 27
buildToolsVersion '27.0.3'

defaultConfig {
...
minSdkVersion 19
targetSdkVersion 27
...
}

compileOptions {
sourceCompatibility JavaVersion.VERSION_1_8
targetCompatibility JavaVersion.VERSION_1_8
}
}

dependencies {
...
implementation "com.android.support:appcompat-v7:27.1.1"
...
}
```
