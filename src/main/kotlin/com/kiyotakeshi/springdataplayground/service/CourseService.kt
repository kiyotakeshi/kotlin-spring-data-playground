package com.kiyotakeshi.springdataplayground.service

import com.kiyotakeshi.springdataplayground.model.NewCourseRequest
import com.kiyotakeshi.springdataplayground.model.ReviewRequest
import com.kiyotakeshi.springdataplayground.entity.Course
import com.kiyotakeshi.springdataplayground.entity.Review

interface CourseService {
    fun getCourses(): List<Course>
    fun getCourse(courseId: Long): Course
    fun addCourse(request: NewCourseRequest): Course
    fun deleteCourse(courseId: Long): String
    fun addReviewToCourse(courseId: Long, review: ReviewRequest): Review
    fun deleteReviewInCourse(courseId: Long, reviewId: Long): String
}
