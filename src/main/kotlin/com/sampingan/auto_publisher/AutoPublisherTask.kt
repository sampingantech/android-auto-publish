/*
 * Copyright (c) 2019.
 * PT. Sampingan Mitra Indonesia
 */
package com.sampingan.auto_publisher

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

// TODO: Does this necessary to extend from DefaultTask or just custom task?
//      This might be not used, will be focused on releaseScript.gradle.kts

open class AutoReleaseTask : DefaultTask() {

    @Option(option = "track",
            description = "Configure which channel to target for publishing")
    @Input
    var track: String = ""

    @Option(option = "user-fraction",
            description = "Configure user fraction to target a range of user")
    @Input
    var userFraction: String = ""

    @TaskAction
    @Throws(IllegalArgumentException::class)
    fun check() {
        println("=== check for track & fraction ===")

        if (track.isBlank() || userFraction.isBlank()) {
            throw IllegalArgumentException("""
        |Please provide an argument:
        |1. argument for --track e.g: internal, alpha, beta or production
        |2. argument for --user-fraction e.g: 0.1 = 10%; 0.25 = 25%; 1 = 100%
        """.trimMargin())
        } else {
            println("$track - $userFraction")
        }
    }
}
