import de.fayard.refreshVersions.core.versionFor

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    kotlin("plugin.serialization")
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.myapplication"
    compileSdk = Consts.AndroidCompileSdk

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = Consts.AndroidMinSdk
        targetSdk = Consts.AndroidTargetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    flavorDimensions += "environment"
    productFlavors {
        create("dev") {
            dimension = "environment"
        }
        create("stage") {
            dimension = "environment"
        }
        create("hotfix") {
            dimension = "environment"
        }
        create("prod") {
            dimension = "environment"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.compiler)
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":feature:login"))
    implementation(project(":feature:profile"))

    implementation(platform(AndroidX.compose.bom))
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.foundation)
    implementation(AndroidX.compose.material)
    implementation(AndroidX.compose.ui.util)
    implementation(AndroidX.compose.runtime.liveData)
    implementation(AndroidX.activity.compose)

    implementation(AndroidX.core.ktx)
    implementation(AndroidX.lifecycle.runtime.ktx)
    implementation(AndroidX.appCompat)
    implementation(Google.android.material)
    testImplementation(Testing.junit4)
    androidTestImplementation(AndroidX.test.ext.junit)
    implementation(AndroidX.compose.ui.testJunit4)
    androidTestImplementation(AndroidX.compose.ui.testJunit4)
    debugImplementation(platform(AndroidX.compose.bom))
    debugImplementation(AndroidX.compose.ui.testManifest)
}