package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutMeButton: Button = findViewById(R.id.about_me_button)
        aboutMeButton.setOnClickListener {
            val intent = Intent(this, AboutMeActivity::class.java)
            startActivity(intent)
        }

        val resumeButton: Button = findViewById(R.id.resume_button)
        resumeButton.setOnClickListener {
            val intent = Intent(this, ResumeActivity::class.java)
            startActivity(intent)
        }

        val projectsButton: Button = findViewById(R.id.projects_button)
        projectsButton.setOnClickListener {
            val intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }

        val skillsButton: Button = findViewById(R.id.skills_button)
        skillsButton.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val contactInfoButton: Button = findViewById(R.id.contact_info_button)
        contactInfoButton.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
    }
}
