package com.yadavyashvant

import com.yadavyashvant.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {

    configureSerialization()
    configureMonitoring()
    configureRouting()

}
