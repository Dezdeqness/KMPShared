import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    id("com.android.library")
    id("maven-publish")
    alias(libs.plugins.kmmbridge)
}

group = "com.dezdeqness.kmm"
version = "1.0.0"

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
        publishAllLibraryVariants()
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "SharedKMP"
            isStatic = true
        }
    }


    sourceSets {
        commonMain.dependencies {
            // put your Multiplatform dependencies here
        }
    }
}

android {
    namespace = "com.dezdeqness.shared"
    compileSdk = 34
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = 24
    }
}

addGithubPackagesRepository()

kmmbridge {
    gitHubReleaseArtifacts()
    spm()
}