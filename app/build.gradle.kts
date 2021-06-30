plugins {
    id(Config.Plugin.android)
    id(Config.Plugin.kotlinAndroid)
}

android {
    compileSdkVersion(Versions.compileSdkVersion)

    defaultConfig {
        applicationId(ApplicationId.appId)
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode(Release.versionCode)
        versionName(Release.versionName)

        testInstrumentationRunner(Config.testRunner)
    }

    buildTypes {
        getByName("release") {
            minifyEnabled false
            proguardFiles getDefaultProguardFile ('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
}

dependencies {

    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.coreKtx)
    implementation(Libraries.appcompat)
    implementation(Libraries.material)
    implementation(Libraries.constraintlayout)
}