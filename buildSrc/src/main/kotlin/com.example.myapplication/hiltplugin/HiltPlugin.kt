package com.example.myapplication.hiltplugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

class HiltPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            dependencies {
                add("implementation", Google.dagger.hilt.android)
                add("kapt", Google.dagger.hilt.compiler)
                add("implementation", AndroidX.hilt.navigationCompose)
            }
        }
    }
}