package com.kiyotakeshi.springdataplayground.entity

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person(
    var name: String,
    var location: String,
    var birthData: LocalDate
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0

    override fun toString(): String {
        return "Person(name='$name', location='$location', birthData=$birthData, id=$id)"
    }
}
