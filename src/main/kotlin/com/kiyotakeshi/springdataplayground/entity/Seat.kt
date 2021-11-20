package com.kiyotakeshi.springdataplayground.entity

import javax.persistence.*

@Entity
@Table(name = "seats")
data class Seat(
    var name: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0

    override fun toString(): String {
        return "Seat(name='$name', id=$id)"
    }
}
