

dependencies {

    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    //Moshi
    implementation("com.squareup.moshi:moshi-kotlin:1.15.1")
    //Converter Moshi

    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")
    val lifecycle_version = "2.8.1"

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    // Picasso
    implementation("com.squareup.picasso:picasso:2.8")
    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    // Gson

    implementation("com.squareup.retrofit2:converter-gson:2.3.0")

    //Preferences
    implementation("androidx.preference:preference:1.2.0")
    // Robolectric
    testImplementation("org.robolectric:robolectric:4.12.2")
    testImplementation("org.hamcrest:hamcrest:2.2")
    // Kotlin extensions for androidx.test.core
    testImplementation("androidx.test:core-ktx:1.5.0")
    // Kotlin extensions for androidx.test.ext.junit
    testImplementation("androidx.test.ext:junit-ktx:1.1.5")
    testImplementation("androidx.arch.core:core-testing:2.2.0")

    //Mockito
    testImplementation("org.mockito:mockito-core:5.3.1")
    testImplementation("org.mockito:mockito-inline:4.1.0")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
