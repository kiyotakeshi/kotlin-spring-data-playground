package com.kiyotakeshi.springdataplayground.model

import java.time.LocalDateTime

data class NewCourseRequest(
    var name: String,
    var lastUpdateDate: LocalDateTime,
    val createdDate: LocalDateTime
)
