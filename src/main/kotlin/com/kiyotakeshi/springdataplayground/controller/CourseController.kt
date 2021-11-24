package com.kiyotakeshi.springdataplayground.controller

import com.kiyotakeshi.springdataplayground.entity.Course
import com.kiyotakeshi.springdataplayground.entity.Review
import com.kiyotakeshi.springdataplayground.model.NewCourseRequest
import com.kiyotakeshi.springdataplayground.model.ReviewRequest
import com.kiyotakeshi.springdataplayground.service.CourseService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/courses")
class CourseController(
    private val courseService: CourseService
) {
    @GetMapping
    fun list() = courseService.getCourses()

    @GetMapping("/{courseId}")
    fun getCourse(@PathVariable courseId: Long) = courseService.getCourse(courseId)

    @PostMapping()
    fun addCourse(@RequestBody request: NewCourseRequest): Course = courseService.addCourse(request)

    @DeleteMapping("/{courseId}")
    fun deleteCourse(@PathVariable courseId: Long) = courseService.deleteCourse(courseId)

    @PostMapping("/{courseId}/reviews")
    fun addReviewToCourse(@PathVariable courseId: Long, @RequestBody review: ReviewRequest): Review =
        courseService.addReviewToCourse(courseId, review)

    @DeleteMapping("/{courseId}/reviews/{reviewId}")
    fun deleteReviewInCourse(@PathVariable courseId: Long, @PathVariable reviewId: Long): String {
        return courseService.deleteReviewInCourse(courseId, reviewId)
    }
}
