package com.panca.dicoding_submission

import java.io.Serializable
import java.util.Date

data class Article(
    val title: String,
    val overview: String,
    val image: Int,
    val author: String,
    val date: Date,
) : Serializable
