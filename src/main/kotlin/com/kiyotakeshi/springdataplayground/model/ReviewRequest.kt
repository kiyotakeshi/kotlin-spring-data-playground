package com.kiyotakeshi.springdataplayground.model

data class ReviewRequest(
    val rating: String,
    val title: String,
    val description: String
)
