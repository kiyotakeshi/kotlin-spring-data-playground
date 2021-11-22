package com.kiyotakeshi.springdataplayground.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Course(
    var name: String,
    var lastUpdateDate: LocalDateTime,
    val createdDate: LocalDateTime
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0L

    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    @JsonManagedReference
    var reviews: MutableList<Review> = mutableListOf();

    override fun toString(): String {
        return "Course(name='$name', lastUpdateDate=$lastUpdateDate, createdDate=$createdDate, id=$id, reviews=$reviews)"
    }
}
