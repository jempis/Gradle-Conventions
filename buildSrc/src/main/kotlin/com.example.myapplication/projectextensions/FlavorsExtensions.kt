package com.example.myapplication.projectextensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

internal fun Project.configureFlavors(
    commonExtension: CommonExtension<*, *, *, *>
) {
    commonExtension.apply {

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
    }
}