import org.jetbrains.intellij.tasks.PrepareSandboxTask

plugins {
    id("ssg.intellij.common")
    id("java")
    id("org.jetbrains.intellij")
}

group = "com.jessebrault"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

intellij {
    version.set("2023.1.2")
    type.set("IC")
    plugins.add(file("gst-intellij-plugin/build/idea-sandbox/plugins/gst-intellij-plugin"))
}

tasks {
    withType<JavaCompile> {
        targetCompatibility = "17"
        sourceCompatibility = "17"
    }

    withType<PrepareSandboxTask> {
        dependsOn(gradle.includedBuild("gst-intellij-plugin").task(":prepareSandbox"))
    }

    patchPluginXml {
        sinceBuild.set("231")
        version.set(project.version.toString())
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }

    test {
        useJUnitPlatform()
    }
}



