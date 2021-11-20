package com.kiyotakeshi.springdataplayground.entity

import javax.persistence.*

@Entity
@Table(name = "students")
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0
    lateinit var name: String

    // 生徒から座席情報を参照(方方向の参照)
    @OneToOne
    @JoinColumn(name = "seat_id")
    var seat: Seat? = null

    constructor(name: String, seat: Seat?) {
        this.name = name
        this.seat = seat
    }

    protected constructor() {}

    override fun toString(): String {
        return "Student(id=$id, name=$name, seat=$seat)"
    }
}
