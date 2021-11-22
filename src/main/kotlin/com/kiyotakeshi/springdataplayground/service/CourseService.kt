package com.kiyotakeshi.springdataplayground.service

import com.kiyotakeshi.springdataplayground.controller.ReviewRequest
import com.kiyotakeshi.springdataplayground.entity.Course
import com.kiyotakeshi.springdataplayground.entity.Review

interface CourseService {
    fun getCourses(): List<Course>
    fun addReview(courseId: Long, review: ReviewRequest): Review
}
