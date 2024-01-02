package com.panca.dicoding_submission

import Article
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val article = intent.getSerializableExtra("article") as Article

        val titleTextView: TextView = findViewById(R.id.titleDetailTextView)
        val overviewTextView: TextView = findViewById(R.id.overviewDetailTextView)
        val imageDetail: ImageView = findViewById(R.id.imageDetailImageView)
        titleTextView.text = article.title
        overviewTextView.text = article.overview
        imageDetail.setImageResource(article.image)
    }
}
