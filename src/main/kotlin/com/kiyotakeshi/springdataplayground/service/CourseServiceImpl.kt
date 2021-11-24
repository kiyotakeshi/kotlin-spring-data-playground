package com.kiyotakeshi.springdataplayground.service

import com.kiyotakeshi.springdataplayground.model.NewCourseRequest
import com.kiyotakeshi.springdataplayground.model.ReviewRequest
import com.kiyotakeshi.springdataplayground.entity.Course
import com.kiyotakeshi.springdataplayground.entity.Review
import com.kiyotakeshi.springdataplayground.repository.CourseRepository
import com.kiyotakeshi.springdataplayground.repository.ReviewRepository
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class CourseServiceImpl(
    private val courseRepository: CourseRepository,
    private val reviewRepository: ReviewRepository
) : CourseService {
    override fun getCourses(): List<Course> {
        return courseRepository.findAll();
    }

    override fun getCourse(courseId: Long): Course {
        return courseRepository.findById(courseId).orElseThrow()
    }

    override fun addCourse(request: NewCourseRequest): Course {
        if (courseRepository.findByName(request.name).isPresent) {
            throw RuntimeException("same course(${request.name}) is already exists")
        }

        return courseRepository.save(
            Course(
                request.name,
                request.lastUpdateDate,
                request.createdDate
            )
        )
    }

    override fun deleteCourse(courseId: Long): String {
        val course = courseRepository.findById(courseId).orElseThrow()
        courseRepository.delete(course)
        return "deleted course: ${course.name}"
    }

    override fun addReviewToCourse(courseId: Long, request: ReviewRequest): Review {
        val course = courseRepository.findById(courseId).orElseThrow()
        val review = Review(request.rating, request.title, request.description, course)
        return reviewRepository.save(review)
    }

    override fun deleteReviewInCourse(courseId: Long, reviewId: Long): String {
        val course = courseRepository.findById(courseId).orElseThrow()
        val review = reviewRepository.findById(reviewId).orElseThrow()
        course.deleteReview(review)
        courseRepository.saveAndFlush(course)
        return "deleted review(title: ${review.title})"
    }
}
