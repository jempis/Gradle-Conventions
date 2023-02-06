plugins {
    id("com.example.myapplication.feature-plugin")
}

android {
    namespace = "com.example.myapplication.feature.profile"
}

dependencies {
    implementation(project(":feature:login"))

    implementation(AndroidX.appCompat)

    // Navigation
    implementation(AndroidX.navigation.compose)

    // Compose
    implementation(AndroidX.constraintLayout.compose)
    implementation(Google.accompanist.insets.ui)
}