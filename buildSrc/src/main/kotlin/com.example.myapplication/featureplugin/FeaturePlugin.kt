package com.example.myapplication.featureplugin

import AndroidX
import Consts
import com.android.build.api.dsl.LibraryExtension
import com.example.myapplication.projectextensions.configureKotlinAndroid
import com.example.myapplication.projectextensions.configureFlavors
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.project

class FeaturePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            pluginManager.apply {
                apply("com.android.library")
                apply("kotlin-android")
                apply("kotlin-kapt")

                // Custom plugin for Hilt
                apply("com.example.myapplication.hilt-plugin")
            }

           extensions.configure<LibraryExtension> {
               configureKotlinAndroid(this)
               defaultConfig.targetSdk = Consts.AndroidTargetSdk
               configureFlavors(this)
           }

            dependencies {
                add("implementation", AndroidX.core.ktx)
                add("implementation", AndroidX.lifecycle.viewModelCompose)
                add("implementation", AndroidX.hilt.navigationCompose)
            }
        }
    }
}