import kotlin.system.exitProcess

val channelTrack: String by project
val userFraction: String by project

//tasks.register<AutoReleaseTask>("auto") {
//    group = "publishing"
//    description = "Bump version, git tagging & commit, then auto upload to play store"
//
//
//}

val autoPublishToPlayStore by tasks.registering {
//
//    val test = file("")
//    test.createNewFile()
    doFirst {
        if (!project.hasProperty("channelTrack") ||
                !project.hasProperty("userFraction")) {
            println()
            exitProcess(1)
        }
    }
}
