package com.dezdeqness.shared

import platform.UIKit.UIDevice

class IOSPlatform: ExamplePlatform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): ExamplePlatform = IOSPlatform()