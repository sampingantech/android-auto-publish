import kotlin.system.exitProcess

val channelTrack: String by project
val userFraction: String by project

val autoPublishToPlayStore by tasks.registering {
    //
//    val test = file("")
//    test.createNewFile()
    doFirst {
        if (!project.hasProperty("channelTrack") ||
                !project.hasProperty("userFraction")) {
            println("""
                |Please provide an argument:
                |1. argument for --track e.g: internal, alpha, beta or production
                |2. argument for --user-fraction e.g: 0.1 = 10%; 0.25 = 25%; 1 = 100%
        """.trimMargin())
            exitProcess(1)
        } else {
            println("succeed")
        }
    }
}
