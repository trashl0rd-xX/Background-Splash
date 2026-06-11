package com.trashlord.floatingisles

import android.service.dreams.DreamService
import android.webkit.WebView

/**
 * Screensaver mode. Registering a DreamService makes "Floating Isles"
 * appear as a selectable option in Settings > Device Preferences >
 * Screen saver — replacing Google's Backdrop with the world generator.
 */
class IslesDreamService : DreamService() {
    private var web: WebView? = null

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        isInteractive = false
        isFullscreen = true
        isScreenBright = true
        web = WebView(this).apply {
            settings.javaScriptEnabled = true
            loadUrl("file:///android_asset/floating-isles.html")
        }
        setContentView(web)
    }

    override fun onDetachedFromWindow() {
        web?.destroy()
        web = null
        super.onDetachedFromWindow()
    }
}
