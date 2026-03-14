plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    id(libs.plugins.daggerHilt.get().toString())
    id(libs.plugins.ksp.get().toString())
}

android {
    namespace = libs.plugins.networkNameSpace.get().toString()
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
   kotlinOptions {
        jvmTarget = libs.versions.jvmTarget.get()
    }
    /* buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinCompilerVersion.get()
    }*/
}

dependencies {

    //region D.I
    implementation(libs.hilt.core)
    implementation(project(":core"))
    ksp(libs.hilt.compiler)
    ksp(libs.hilt.ksp.compiler)
    //endregion

    //region Data Dependencies
    implementation(libs.okhttp.logging.interceptor)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.gson.converter)
    //endregion
}