plugins {
    id("com.example.myapplication.feature-plugin")
}

android {
    namespace = "com.example.myapplication.feature.login"
}

dependencies {
    // Navigation
    implementation(AndroidX.navigation.compose)

    // region Compose
    implementation(platform(AndroidX.compose.bom))
    implementation(AndroidX.compose.ui.text)
    implementation(AndroidX.compose.material.icons.core)
    implementation(AndroidX.compose.material.icons.extended)

    // Accompanist
    implementation(Google.accompanist.pager)
    implementation(Google.accompanist.pager.indicators)
    // endregion
}