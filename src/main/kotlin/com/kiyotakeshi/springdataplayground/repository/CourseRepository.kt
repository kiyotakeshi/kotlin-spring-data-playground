package com.kiyotakeshi.springdataplayground.repository

import com.kiyotakeshi.springdataplayground.entity.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository : JpaRepository<Course, Long> {
}
