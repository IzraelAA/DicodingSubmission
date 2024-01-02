package com.panca.dicoding_submission

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val photoImageView: ImageView = findViewById(R.id.photoImageView)
        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val emailTextView: TextView = findViewById(R.id.emailTextView)

        // Ganti dengan foto diri Anda, nama, dan email
        photoImageView.setImageResource(R.drawable.profile_photo)
        nameTextView.text = getString(R.string.name)
        emailTextView.text = getString(R.string.email)
    }
}
