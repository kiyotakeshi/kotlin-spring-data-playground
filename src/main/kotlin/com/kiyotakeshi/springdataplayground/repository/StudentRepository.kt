package com.kiyotakeshi.springdataplayground.repository

import com.kiyotakeshi.springdataplayground.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student?, Int?>
