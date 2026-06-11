package com.trashlord.floatingisles

import android.app.Activity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView

/**
 * Ambient display mode. FLAG_KEEP_SCREEN_ON is the same mechanism video
 * players use during playback — while this activity is in the foreground,
 * Android TV's screensaver/backdrop timer never fires.
 */
class MainActivity : Activity() {
    private lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.loadUrl("file:///android_asset/floating-isles.html")
        setContentView(web)
    }

    override fun onDestroy() {
        web.destroy()
        super.onDestroy()
    }
}
