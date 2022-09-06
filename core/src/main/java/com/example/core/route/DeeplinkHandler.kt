package com.example.core.route

interface DeeplinkHandler {
    fun process(deeplink: String): Boolean
}
