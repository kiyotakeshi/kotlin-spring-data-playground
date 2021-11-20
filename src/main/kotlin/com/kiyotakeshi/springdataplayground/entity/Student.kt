package com.kiyotakeshi.springdataplayground.entity

import javax.persistence.*

@Entity
@Table(name = "students")
data class Student(
    var name: String,
    @OneToOne @JoinColumn(name = "seat_id")
    var seat: Seat? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0

    override fun toString(): String {
        return "Student(name='$name', seat=$seat, id=$id)"
    }
}
