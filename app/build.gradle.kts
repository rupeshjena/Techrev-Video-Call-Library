plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.techrevvideocallplugin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.techrevvideocallplugin"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        //compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    /*implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.1")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")*/
    /*Added by Rupesh*/
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))
    val appcompat_version = "1.6.1"
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:$appcompat_version")
    // For loading and tinting drawables on older versions of the platform
    implementation("androidx.appcompat:appcompat-resources:$appcompat_version")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.9.10")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")
    implementation ("org.greenrobot:eventbus:3.2.0")
    implementation ("com.google.code.gson:gson:2.9.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("androidx.cardview:cardview:1.0.0")
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")
    implementation ("com.google.android.gms:play-services-location:21.0.1")
    implementation ("com.withpersona.sdk2:inquiry:2.2.27")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("com.squareup.okhttp3:okhttp:4.10.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.10.0")
    //implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.getkeepsafe.relinker:relinker:1.4.3")
    implementation ("com.twilio:audioswitch:1.1.2")
    implementation ("com.twilio:video-android:5.14.0")
    implementation ("com.google.android.material:material:1.10.0")
    implementation ("com.crowdfire.cfalertdialog:cfalertdialog:1.1.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    // To preview pdf
    implementation ("com.github.barteksc:android-pdf-viewer:2.8.2")
    //implementation ("com.github.barteksc:android-pdf-viewer:3.2.0-beta.1")
    // SUB-PROJECT DEPENDENCIES END
    /*To import the sqlite jar files from local library*/ // Added By Rupesh
    implementation (files("libs/sqlite-connector.jar"))
    implementation (files("libs/sqlite-native-driver.jar"))
    /*To import the sqlite jar files from local library*/ // Added By Rupesh
    /*To import the whiteboard module to the app*/ // Added by Rupesh
    implementation (files("libs/drawingboard.aar"))
    /*To import the whiteboard module to the app*/ // Added by Rupesh
    /*Added by Rupesh*/ // To use custom dialog in app
    //implementation 'io.github.tutorialsandroid:kalertdialog:20.3.6'
    //implementation 'com.github.TutorialsAndroid:progressx:v6.0.19' //required for kalertdialog lib
    /*Added by Rupesh*/ // To use custom dialog in app

}


