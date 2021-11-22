package com.kiyotakeshi.springdataplayground.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnore
import com.kiyotakeshi.springdataplayground.entity.Course
import javax.persistence.*

@Entity
data class Review(
    val rating: String,
    val description: String,
    @ManyToOne @JsonBackReference val course: Course
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0L
}
