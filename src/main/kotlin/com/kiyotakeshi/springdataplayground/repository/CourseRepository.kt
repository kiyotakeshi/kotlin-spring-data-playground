package com.kiyotakeshi.springdataplayground.repository

import com.kiyotakeshi.springdataplayground.entity.Course
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CourseRepository : JpaRepository<Course, Long> {
    fun findByName(name: String): Optional<Course>
}
