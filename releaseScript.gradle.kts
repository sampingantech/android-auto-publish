package com.sampingan.auto_publisher

//val channelTrack: String by project
//val userFraction: String by project

//tasks.register<AutoReleaseTask>("auto") {
//    group = "publishing"
//    description = "Bump version, git tagging & commit, then auto upload to play store"
//
//
//}

val autoPublishToPlayStore by tasks.registering {

    doFirst {
        if (!project.hasProperty("channelTrack") ||
                !project.hasProperty("userFraction")) {
            println()
        }
    }
}
