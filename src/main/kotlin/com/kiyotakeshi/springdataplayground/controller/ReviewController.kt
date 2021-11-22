package com.kiyotakeshi.springdataplayground.controller

import com.kiyotakeshi.springdataplayground.entity.Review
import com.kiyotakeshi.springdataplayground.service.ReviewService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/reviews")
class ReviewController(
    private val reviewService: ReviewService
) {
    @GetMapping()
    fun list() = reviewService.getReviews()

    @GetMapping("/{reviewId}")
    fun getReview(@PathVariable reviewId: Long) = reviewService.getReview(reviewId)
}
