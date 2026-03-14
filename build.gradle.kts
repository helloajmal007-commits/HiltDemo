// Top-level build file where you can add configuration options common to all sub-projects/modules.
/*
plugins {
 alias(libs.plugins.android.application) apply false
 alias(libs.plugins.kotlin.android) apply false
// alias(libs.plugins.kotlin.compose) apply false

 // Hilt and KSP (these are not in the catalog yet, keep explicit IDs)
 id("com.google.dagger.hilt.android") version "2.48" apply false
 id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
}*/


// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
 id("com.android.application") version "8.2.1" apply false
 id("org.jetbrains.kotlin.android") version "1.9.0" apply false
 id("com.android.library") version "8.2.1" apply false
 id("com.google.dagger.hilt.android") version "2.47" apply false
 id("com.google.devtools.ksp") version "1.9.21-1.0.16" apply false
}