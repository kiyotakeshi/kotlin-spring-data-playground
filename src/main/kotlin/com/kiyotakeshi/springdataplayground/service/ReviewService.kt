package com.kiyotakeshi.springdataplayground.service

import com.kiyotakeshi.springdataplayground.entity.Review

interface ReviewService {
    fun getReviews(): List<Review>
    fun getReview(reviewId: Long): Review
}
