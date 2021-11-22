package com.kiyotakeshi.springdataplayground.service

import com.kiyotakeshi.springdataplayground.entity.Review
import com.kiyotakeshi.springdataplayground.repository.ReviewRepository
import org.springframework.stereotype.Service

@Service
class ReviewServiceImpl(
    private val reviewRepository: ReviewRepository
) : ReviewService {
    override fun getReviews(): List<Review> {
        return reviewRepository.findAll()
    }

    override fun getReview(reviewId: Long): Review {
        return reviewRepository.findById(reviewId).orElseThrow()
    }
}
