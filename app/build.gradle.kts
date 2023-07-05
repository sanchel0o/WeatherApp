@file:Suppress("UnstableApiUsage")
@Suppress("DSL_SCOPE_VIOLATION")

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.sanchelo.weatherapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.sanchelo.weatherapp"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            versionNameSuffix  = "-debug"
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        compose = true
        dataBinding = false
        viewBinding = false
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    kotlinOptions {
        jvmTarget = libs.versions.jvmTarget.get()
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeKotlinCompiler.get()
    }
}

dependencies {
    implementation(platform(libs.compose.bom))
    implementation(platform(libs.junit.bom))
    implementation(libs.bundles.core)
    implementation(libs.bundles.compose)
    implementation(libs.bundles.retrofit2)
    implementation(libs.bundles.test)
}
