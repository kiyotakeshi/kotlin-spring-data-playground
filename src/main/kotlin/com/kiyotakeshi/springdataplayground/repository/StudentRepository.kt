package com.kiyotakeshi.springdataplayground.repository

import com.kiyotakeshi.springdataplayground.entity.SimpleStudent
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<SimpleStudent?, Int?>
