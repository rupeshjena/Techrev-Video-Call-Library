pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven (url = "https://sdk.withpersona.com/android/releases")
    }
}

rootProject.name = "TechrevVideoCallPlugin"
include(":app")
include(":TechrevVideoCallLibrary")
