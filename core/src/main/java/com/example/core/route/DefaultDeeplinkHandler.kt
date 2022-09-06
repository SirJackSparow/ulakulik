package com.example.core.route

class DefaultDeeplinkHandler(private val processors: Set<@JvmSuppressWildcards DeepLinkProcessor>) :
    DeeplinkHandler {
    override fun process(deeplink: String): Boolean {
        processors.forEach {
            if (it.matches(deeplink)) {
                it.execute(deeplink)
                return true
            }
        }
        return false
    }
}
