rootProject.name = "ssg-intellij-plugin"

pluginManagement {
    includeBuild("gradle-intellij-plugin")

    repositories {
        gradlePluginPortal()

        maven {
            url = uri("https://archiva.jessebrault.com/repository/internal/")

            credentials {
                username = System.getenv("JBARCHIVA_USERNAME")
                password = System.getenv("JBARCHIVA_PASSWORD")
            }
        }

        maven {
            url = uri("https://archiva.jessebrault.com/repository/snapshots/")

            credentials {
                username = System.getenv("JBARCHIVA_USERNAME")
                password = System.getenv("JBARCHIVA_PASSWORD")
            }
        }
    }
}

includeBuild("gst-intellij-plugin")