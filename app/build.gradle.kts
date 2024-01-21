////import org.gradle.internal.impldep.bsh.commands.dir;
////
////plugins {
////    id("com.android.application")
////    id("com.google.gms.google-services")
////}
////
////android {
////    namespace = "com.example.myapplication2"
////    compileSdk = 34
////
////    defaultConfig {
////        applicationId = "com.example.myapplication2"
////        minSdk = 24
////        targetSdk = 34
////        versionCode = 1
////        versionName = "1.0"
////
////        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
////    }
////
////    buildTypes {
////        release {
////            isMinifyEnabled = false
////            proguardFiles(
////                getDefaultProguardFile("proguard-android-optimize.txt"),
////                "proguard-rules.pro"
////            )
////        }
////    }
////    compileOptions {
////        sourceCompatibility = JavaVersion.VERSION_1_8
////        targetCompatibility = JavaVersion.VERSION_1_8
////    }
////    buildFeatures {
////        viewBinding = true
////    }
////}
////dependencies {
////    implementation("androidx.appcompat:appcompat:1.6.1")
////    implementation("com.google.android.material:material:1.11.0")
////    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
////    implementation (platform("com.google.firebase:firebase-bom:32.7.0"))
////    implementation ("com.google.firebase:firebase-analytics-ktx")
////    implementation ("com.google.firebase:firebase-database-ktx")
////    implementation ("com.google.firebase:firebase-storage")
////    implementation ("com.firebaseui:firebase-ui-database:8.0.2")
////    implementation ("com.github.rey5137:material:1.3.1")
////    implementation("androidx.cardview:cardview:1.0.0")
////    implementation("androidx.recyclerview:recyclerview:1.3.2")
////    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
////    implementation ("io.github.pilgr:paperdb:2.7.2")
////    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
////    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
////    implementation("androidx.navigation:navigation-fragment:2.7.6")
////    implementation ("com.squareup.picasso:picasso:2.8")
////    implementation("androidx.navigation:navigation-ui:2.7.6")
////    implementation ("de.hdodenhof:circleimageview:3.1.0")
//////    implementation("com.cepheuen.elegant-number-button:lib:1.0.2")
////    implementation ("com.github.Damercy:IncrementDecrementButton:2.0.0")
//////    implementation ("com.theartofdev.edmodo:android-image-cropper:2.8.0")
////    implementation("com.google.firebase:firebase-inappmessaging:20.4.0")
////    implementation("com.github.rey5137:material:1.3.1")
////    testImplementation("junit:junit:4.13.2")
////    androidTestImplementation("androidx.test.ext:junit:1.1.5")
////    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
////    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
////}
////
////
////
////
//
//import org.gradle.internal.impldep.bsh.commands.dir
//
//plugins {
//    id("com.android.application")
//    id("com.google.gms.google-services")
//}
//
//android {
//    namespace = "com.example.myapplication2"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.example.myapplication2"
//        minSdk = 24
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//
//    buildFeatures {
//        viewBinding = true
//    }
//}
//
//dependencies {
//    implementation("androidx.appcompat:appcompat:1.6.1")
//    implementation("com.google.android.material:material:1.11.0")
//    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//    implementation("com.google.firebase:firebase-analytics-ktx:32.7.0")
//    implementation("com.google.firebase:firebase-database-ktx:32.7.0")
//    implementation("com.google.firebase:firebase-storage:32.7.0")
//    implementation("com.firebaseui:firebase-ui-database:8.0.2")
//    implementation("com.github.rey5137:material:1.3.1")
//    implementation("androidx.cardview:cardview:1.0.0")
//    implementation("androidx.recyclerview:recyclerview:1.3.2")
//    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
//    implementation("io.github.pilgr:paperdb:2.7.2")
//    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
//    implementation("androidx.navigation:navigation-fragment:2.7.6")
//    implementation("com.squareup.picasso:picasso:2.8")
//    implementation("androidx.navigation:navigation-ui:2.7.6")
//    implementation("de.hdodenhof:circleimageview:3.1.0")
//    // Remove the IncrementDecrementButton library
//    // implementation("com.github.Damercy:IncrementDecrementButton:2.0.0")
//    // Uncomment the line below if you decide to use ElegantNumberButton
//    // implementation("com.cepheuen.elegant-number-button:lib:1.0.2")
//    // implementation("com.theartofdev.edmodo:android-image-cropper:2.8.0")
//    implementation("com.google.firebase:firebase-inappmessaging:20.4.0")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
//}

import org.gradle.internal.impldep.bsh.commands.dir

plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.myapplication2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication2"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-database-ktx")
    implementation("com.google.firebase:firebase-storage")
    implementation("com.firebaseui:firebase-ui-database:8.0.2")
    implementation("com.github.rey5137:material:1.3.1")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
    implementation("io.github.pilgr:paperdb:2.7.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.navigation:navigation-fragment:2.7.6")
    implementation("com.squareup.picasso:picasso:2.8")
    implementation("androidx.navigation:navigation-ui:2.7.6")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    // Remove the IncrementDecrementButton library
     implementation("com.github.Damercy:IncrementDecrementButton:2.0.0")
    // Uncomment the line below if you decide to use ElegantNumberButton
    // implementation("com.cepheuen.elegant-number-button:lib:1.0.2")
    // implementation("com.theartofdev.edmodo:android-image-cropper:2.8.0")
    implementation("com.google.firebase:firebase-inappmessaging:20.4.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
}
