package com.kiyotakeshi.springdataplayground.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*
import javax.validation.constraints.Size

@Entity
data class Review(
    val rating: String,
    val title: String,

    @field:Size(max = 5000, message = "Invalid field: too long (up to 5000 words)")
    @Column(length = 5000)
    val description: String,

    // こちらに  CascadeType.PERSIST を指定すると
    // course に紐づく review 1件を削除する際に、
    // その review から course をたどってそこに含まれる他の review を削除しようとしてエラーになる
    @ManyToOne
    @JsonBackReference
    val course: Course
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0L
}
