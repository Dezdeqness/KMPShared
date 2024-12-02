package com.dezdeqness.shared

interface ExamplePlatform {
    val name: String
}

expect fun getPlatform(): ExamplePlatform


