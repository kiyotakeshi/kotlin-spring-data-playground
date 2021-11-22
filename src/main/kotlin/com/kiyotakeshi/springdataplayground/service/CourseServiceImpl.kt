package com.kiyotakeshi.springdataplayground.service

import com.kiyotakeshi.springdataplayground.controller.ReviewRequest
import com.kiyotakeshi.springdataplayground.entity.Course
import com.kiyotakeshi.springdataplayground.entity.Review
import com.kiyotakeshi.springdataplayground.repository.CourseRepository
import com.kiyotakeshi.springdataplayground.repository.ReviewRepository
import org.springframework.stereotype.Service

@Service
class CourseServiceImpl(
    private val courseRepository: CourseRepository,
    private val reviewRepository: ReviewRepository
) : CourseService {
    override fun getCourses(): List<Course> {
        return courseRepository.findAll();
    }

    override fun addReview(courseId: Long, request: ReviewRequest): Review {
        val course = courseRepository.findById(courseId).orElseThrow()
        val review = Review(request.rating, request.description, course)
        return reviewRepository.save(review)
    }
}
