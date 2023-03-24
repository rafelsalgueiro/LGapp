package com.example.a4buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.a4buttons.databinding.ActivityMapViewerBinding

class MapViewer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMapViewerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val googleEarth = binding.googleEarth
        googleEarth.webViewClient = WebViewClient()
        var settings = googleEarth.getSettings()
        settings.javaScriptEnabled = true
        googleEarth.loadUrl("https://earth.google.com/web")
    }

}