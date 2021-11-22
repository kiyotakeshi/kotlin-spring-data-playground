package com.kiyotakeshi.springdataplayground.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Course(
    var name: String,
    var lastUpdateDate: LocalDateTime,
    val createdDate: LocalDateTime
) {
    @Id
    @GeneratedValue
    val id: Long = 0L

    override fun toString(): String {
        return "Course(name='$name', lastUpdateDate=$lastUpdateDate, createdDate=$createdDate, id=$id)"
    }
}
