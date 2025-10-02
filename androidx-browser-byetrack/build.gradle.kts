plugins {
    alias(libs.plugins.android.library)
}

android {
    buildFeatures {
        aidl = true
    }
    // The sourceSets block should be here
    sourceSets {
        getByName("main") {
            aidl.srcDirs("src/main/aidl")
        }
    }
    namespace = "androidx.browser"
    compileSdk = 36

    defaultConfig {
        minSdk = 34

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.byetrack)

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


    api(libs.jspecify)
    api("androidx.core:core:1.10.0")
    api("androidx.annotation:annotation:1.8.1")
    api("androidx.annotation:annotation-experimental:1.4.1")
    api(libs.guavaListenableFuture)

    implementation("androidx.activity:activity:1.9.0")
    implementation("androidx.collection:collection:1.4.2")
    implementation("androidx.concurrent:concurrent-futures:1.0.0")
    implementation("androidx.interpolator:interpolator:1.0.0")

    annotationProcessor(libs.nullaway)

    testImplementation(libs.mockitoCore4)
    testImplementation(libs.guavaAndroid)
    testImplementation(libs.junit)

    androidTestImplementation(libs.junit)
    androidTestImplementation("androidx.appcompat:appcompat:1.1.0")
}
