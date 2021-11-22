package com.kiyotakeshi.springdataplayground.controller

import com.kiyotakeshi.springdataplayground.entity.Course
import com.kiyotakeshi.springdataplayground.entity.Review
import com.kiyotakeshi.springdataplayground.service.CourseService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/courses")
class CourseController(
    private val courseService: CourseService
) {

    @GetMapping
    fun list() = courseService.getCourses()

    @PostMapping("/{courseId}/reviews")
    fun addReview(@PathVariable courseId: Long, @RequestBody review: ReviewRequest): Review =
        courseService.addReview(courseId, review)
}
