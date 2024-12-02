package com.dezdeqness.shared

class KmmAnalyticsComposer {
    private val platform = getPlatform()

    fun composePostEventString(id: String): String {
        return """
            postId: $id
            platform: ${platform.name}
        """.trimIndent()
    }

}
