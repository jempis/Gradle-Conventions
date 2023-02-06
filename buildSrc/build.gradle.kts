plugins {
    val kotlinVersion = "1.7.10"

    `kotlin-dsl`

    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion
}

dependencies {
    compileOnly(Android.tools.build.gradlePlugin)
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:_")
    implementation(KotlinX.serialization.json)
}

gradlePlugin {
    plugins {
        register("feature-plugin") {
            id = "com.example.myapplication.feature-plugin"
            implementationClass = "com.example.myapplication.featureplugin.FeaturePlugin"
        }
        register("hilt-plugin") {
            id = "com.example.myapplication.hilt-plugin"
            implementationClass = "com.example.myapplication.hiltplugin.HiltPlugin"
        }
    }
}