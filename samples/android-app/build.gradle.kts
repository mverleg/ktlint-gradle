import com.android.build.gradle.AppExtension
import org.jlleitschuh.gradle.ktlint.KtlintExtension

apply {
    plugin("android")
    plugin("kotlin-android")
    plugin("kotlin-android-extensions")
    plugins.apply("org.jlleitschuh.gradle.ktlint")
}

configure<AppExtension> {
    compileSdkVersion(27)
    defaultConfig {
        minSdkVersion(23)
        targetSdkVersion(27)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    "implementation"("org.jetbrains.kotlin:kotlin-stdlib-jre7:1.2.0")
    "implementation"("com.android.support:appcompat-v7:27.0.2")
    "implementation"("com.android.support:support-v4:27.0.2")
    "implementation"("com.android.support:recyclerview-v7:27.0.2")
    "implementation"("com.android.support:design:27.0.2")
    "testImplementation"("junit:junit:4.12")
    "androidTestImplementation"("com.android.support.test:runner:1.0.1")
    "androidTestImplementation"("com.android.support.test.espresso:espresso-core:3.0.1")
}

configure<KtlintExtension> {
    android = true
}
