package com.dezdeqness.shared

class KmmAnalyticsComposer {
    private val platform = getPlatform()

    fun composePostEventString(id: String): String {
        return """
            event: POST_CLICKED
            postId: $id
            platform: ${platform.name}
        """.trimIndent()
    }

}
