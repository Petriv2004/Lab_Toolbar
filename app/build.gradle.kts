plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "co.unipiloto.toolbar"
    compileSdk = 35

    defaultConfig {
        applicationId = "co.unipiloto.toolbar"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    // Reemplaza las dependencias de soporte con AndroidX
    implementation(libs.appcompat) // androidx.appcompat
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Dependencias para las pruebas
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Elimina esta línea porque estás usando AndroidX
    // implementation("com.android.support:appcompat-v7:28.0.0")

    // Reemplaza con la dependencia correcta para AndroidX
    implementation("androidx.appcompat:appcompat:1.3.1") // Usa AndroidX appcompat
    implementation("androidx.core:core:1.6.0") // Usa AndroidX core
}
