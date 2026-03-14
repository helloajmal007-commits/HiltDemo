plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    id(libs.plugins.daggerHilt.get().toString())
    id(libs.plugins.ksp.get().toString())
}

android {
    namespace = libs.plugins.homeNameSpace.get().toString()
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = libs.versions.jvmTarget.get()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinCompilerVersion.get()
    }

    buildTypes {
        debug {
//            buildConfigField("boolean", "DEVELOPMENT_MODE", "true")
        }
        release {
//          buildConfigField("boolean", "DEVELOPMENT_MODE", "false")

            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(project(":core"))
    implementation(project(":network"))

    //region Data Dependencies
    implementation(libs.okhttp.logging.interceptor)
    implementation(libs.hilt.core)
    implementation(libs.retrofit.core)
    ksp(libs.hilt.compiler)
    ksp(libs.hilt.ksp.compiler)
    implementation(libs.retrofit.gson.converter)
    //endregion

    //region Presentation Dependencies
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.hilt.navigation)
    implementation(libs.compose.ui.graphics)
    implementation(libs.pager)
    implementation(libs.compose.ui.material)
    implementation(libs.compose.activity)
    implementation(libs.coil)
    //endregion

   /* implementation(libs.android.core)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)*/
}