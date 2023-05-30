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

        val LGpage = binding.liquidGalaxyWebsite
        LGpage.webViewClient = WebViewClient()
        LGpage.loadUrl("https://www.liquidgalaxy.eu/2022/10/GSoC2023.html")
    }

}