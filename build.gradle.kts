plugins {
    java
    id("org.springframework.boot") version "3.1.2"
    id("io.spring.dependency-management") version "1.1.2"
    //id("com.ewerk.gradle.plugins.querydsl") version "1.0.10"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_20
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    compileOnly("org.projectlombok:lombok")
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
    annotationProcessor("org.projectlombok:lombok:1.18.26")

    // QueryDsl 패키지 의존성주입 (spring3.x이상)
    implementation("com.querydsl:querydsl-jpa:5.0.0:jakarta");
    annotationProcessor("com.querydsl:querydsl-apt:5.0.0:jakarta");
    annotationProcessor("jakarta.annotation:jakarta.annotation-api");
    annotationProcessor("jakarta.persistence:jakarta.persistence-api");

    testImplementation("org.springframework.boot:spring-boot-starter-test")

}

tasks.withType<Test> {
    useJUnitPlatform()
}