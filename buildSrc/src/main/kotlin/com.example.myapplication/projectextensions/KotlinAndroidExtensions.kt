package com.example.myapplication.projectextensions

import com.android.build.api.dsl.CommonExtension
import de.fayard.refreshVersions.core.versionFor
import org.gradle.api.Project

internal fun Project.configureKotlinAndroid(
    commonExtension: CommonExtension<*, *, *, *>
) {
    commonExtension.apply {
        compileSdk = Consts.AndroidCompileSdk

        defaultConfig {
            minSdk = Consts.AndroidMinSdk
        }

        buildFeatures {
            // Enables Jetpack Compose for this module
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.compiler)
        }
    }
}