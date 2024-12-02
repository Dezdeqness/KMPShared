pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Dezdeqness/KMPShared")
            credentials {
                username = "Dezdeqness"
                password = ""
            }
        }
        maven(url = "https://jitpack.io")
        mavenCentral()
        google()
        maven(url = "https://maven.google.com/")
        maven(url = "https://repo.maven.apache.org/maven2/")
        maven(url = "https://plugins.gradle.org/m2/")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Dezdeqness/KMPShared")
            credentials {
                username = "Dezdeqness"
                password = ""
            }
        }
        maven(url = "https://jitpack.io")
        mavenCentral()
        google()
        maven(url = "https://maven.google.com/")
        maven(url = "https://repo.maven.apache.org/maven2/")
        maven(url = "https://plugins.gradle.org/m2/")
    }
}

rootProject.name = "My Application"
include(":shared")
 