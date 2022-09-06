package com.example.core.route

interface DeepLinkProcessor {
    fun matches(deeplink: String): Boolean
    fun execute(deeplink: String)
}