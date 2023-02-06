/**
 * Dependencies Notation not natively handled by refreshVersions plugin
 * See https://jmfayard.github.io/refreshVersions/dependencies-notations/
 *
 * Note that version is intentionally replaced with _ placeholder to still
 * have it managed by the plugin
 * See https://jmfayard.github.io/refreshVersions/add-dependencies/#wait-what-version-are-those-dependencies-using
 */
object Dependencies {

    object Android {
        const val installReferrer = "com.android.installreferrer:installreferrer:_"
    }

    object Kotlin {
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:_"
    }
    object Google {
        const val secretsGradlePlugin = "com.google.android.libraries.mapsplatform.secrets-gradle-plugin:secrets-gradle-plugin:_"
        const val playServicesAdsIdentifier = "com.google.android.gms:play-services-ads-identifier:_"
    }

    object Braintree {
        const val dropIn = "com.braintreepayments.api:drop-in:_"
    }

    object Adjust {
        const val android = "com.adjust.sdk:adjust-android:_"
    }
}