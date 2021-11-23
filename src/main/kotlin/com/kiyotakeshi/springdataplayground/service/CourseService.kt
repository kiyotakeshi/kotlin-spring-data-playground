package com.kiyotakeshi.springdataplayground.service

import com.kiyotakeshi.springdataplayground.controller.NewCourseRequest
import com.kiyotakeshi.springdataplayground.controller.ReviewRequest
import com.kiyotakeshi.springdataplayground.entity.Course
import com.kiyotakeshi.springdataplayground.entity.Review

interface CourseService {
    fun getCourses(): List<Course>
    fun addReviewToCourse(courseId: Long, review: ReviewRequest): Review
    fun getCourse(courseId: Long): Course
    fun addCourse(request: NewCourseRequest): Course

}
