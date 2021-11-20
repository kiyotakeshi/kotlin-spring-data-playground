package com.kiyotakeshi.springdataplayground.entity

import javax.persistence.*

@Entity
@Table(name = "seats")
class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id = 0
    var name: String? = null

    constructor(name: String?) {
        this.name = name
    }

    protected constructor() {}

    override fun toString(): String {
        return "Seat(id=$id, name=$name)"
    }
}
