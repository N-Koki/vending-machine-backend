import com.diffplug.spotless.LineEnding
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.22"
	kotlin("plugin.spring") version "1.9.22"

	id("com.diffplug.spotless") version "6.19.0"

	id("org.jetbrains.kotlin.plugin.noarg") version "1.7.10"
}

group = "com.vendingmachine"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	// for mybatis
	// ref: https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3")

	// for postgres database
	runtimeOnly("org.postgresql:postgresql")

	// for test
	testImplementation("io.mockk:mockk:1.12.5")
	testRuntimeOnly("org.assertj:assertj-core")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "21"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

spotless {
	lineEndings = LineEnding.UNIX
	kotlin { ktfmt("0.47") }
}

// build, bootRun 実行時に spotlessApply を実行するようにする
tasks.compileKotlin {
	dependsOn("spotlessApply")
}

// for Mybatis NoArgsConstructor https://qiita.com/akira108/items/005830d44075c7968dac
noArg {
	annotation("csp.api.internal.annotation.NoArgsConstructor")
}

// fix build jar name
tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
	archiveFileName.set("vending-machine-api.jar")
}