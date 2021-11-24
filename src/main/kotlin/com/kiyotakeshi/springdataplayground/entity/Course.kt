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

    // course を削除する場合は紐づく review から先に削除する
    // (review table の外部キー制約も指定がある) orphanRemoval を指定
    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER, cascade = [CascadeType.PERSIST], orphanRemoval = true)
    @JsonManagedReference
    var reviews: MutableList<Review> = mutableListOf()

    override fun toString(): String {
        return "Course(name='$name', lastUpdateDate=$lastUpdateDate, createdDate=$createdDate, id=$id, reviews=$reviews)"
    }

    fun deleteReview(review: Review){
        this.reviews.remove(review)
    }
}
