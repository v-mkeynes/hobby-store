pluginManagement {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = uri("https://jitpack.io"))
        mavenCentral {
            content {
                includeModule("com.theartofdev.edmodo", "android-image-cropper")
            }
        }
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = uri("https://jitpack.io"))
        mavenCentral {
            content {
                includeModule("com.theartofdev.edmodo", "android-image-cropper")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

rootProject.name = "My Application2"
include(":app")

