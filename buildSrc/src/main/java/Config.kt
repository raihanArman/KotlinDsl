object Config {

    const val testRunner = "androidx.test.runner.AndroidJUnitRunner"

    object Dependencies{
        const val kotlinPlugin = "gradle-plugin"
        const val androidPlugin = "om.android.tools.build:gradle:${Versions.gradle}"

    }

    object Repositories {
        const val gradleMaven = "https://plugins.gradle.org/m2/"
    }

    object Plugin{
        const val android = "com.android.application"
        const val kotlinAndroid = "kotlin-android"
    }

}