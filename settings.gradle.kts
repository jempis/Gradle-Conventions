pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        id("de.fayard.refreshVersions") version "0.51.0"
        id("org.jetbrains.kotlin.jvm")
        id("com.android.library")
        id("org.jetbrains.kotlin.android")
    }
}

plugins {
    id("de.fayard.refreshVersions")
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include(":feature:login")
include(":feature:profile")