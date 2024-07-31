package com.example.portfolioapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val linkedinButton: Button = findViewById(R.id.linkedin_button)
        linkedinButton.setOnClickListener {
            openUrl("https://www.linkedin.com/in/alfred-suomie-a3655424b")
        }

        val githubButton: Button = findViewById(R.id.github_button)
        githubButton.setOnClickListener {
            openUrl("https://github.com/fredsuomie")
        }

        val twitterButton: Button = findViewById(R.id.twitter_button)
        twitterButton.setOnClickListener {
            openUrl("https://twitter.com/@suomiealfr63954")
        }
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}