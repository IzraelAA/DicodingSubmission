package com.panca.dicoding_submission

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Locale

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val article = intent.getSerializableExtra("article") as Article

        val titleTextView: TextView = findViewById(R.id.titleDetailTextView)
        val overviewTextView: TextView = findViewById(R.id.overviewDetailTextView)
        val imageDetail: ImageView = findViewById(R.id.imageDetailImageView)
        val informationDetailTextView: TextView = findViewById(R.id.informationDetailTextView)
        titleTextView.text = article.title
        overviewTextView.text = article.overview
        imageDetail.setImageResource(article.image)

        val dateFormat = SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH)
        informationDetailTextView.text =
            getString(R.string.information_detail, dateFormat.format(article.date), article.author)
    }
}
