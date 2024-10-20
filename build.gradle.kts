plugins {
    kotlin("jvm") version "1.8.0"
}

group = "com.github.lucidamn"
version = "1.0.0"

java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.javacord:javacord:3.8.0")
}