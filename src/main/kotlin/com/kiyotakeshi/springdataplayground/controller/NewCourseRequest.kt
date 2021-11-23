package com.kiyotakeshi.springdataplayground.controller

import java.time.LocalDateTime

data class NewCourseRequest(
    var name: String,
    var lastUpdateDate: LocalDateTime,
    val createdDate: LocalDateTime
)
