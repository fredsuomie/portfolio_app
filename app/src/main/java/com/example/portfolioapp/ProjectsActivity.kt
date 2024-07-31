package com.example.portfolioapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)

        val project1MoreButton: Button = findViewById(R.id.project1_more_button)
        val project2MoreButton: Button = findViewById(R.id.project2_more_button)

        project1MoreButton.setOnClickListener {
            openGitHubLink("https://github.com/fredsuomie/EMS")
        }

        project2MoreButton.setOnClickListener {
            openGitHubLink("https://github.com/fredsuomie/Employee-Management-System-python")
        }
    }

    private fun openGitHubLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}
