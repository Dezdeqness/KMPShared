package com.dezdeqness.shared

import android.os.Build

class AndroidPlatform : ExamplePlatform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): ExamplePlatform = AndroidPlatform()