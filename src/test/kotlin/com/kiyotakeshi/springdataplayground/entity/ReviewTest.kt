package com.kiyotakeshi.springdataplayground.entity

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.TestConstructor
import java.time.LocalDateTime

@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
internal class ReviewTest(
    private var em: TestEntityManager
) {
    @Test
    internal fun mapping() {
        val course = Course(
            "kotlin-beginner",
            lastUpdateDate = LocalDateTime.now(),
            createdDate = LocalDateTime.of(2021, 11, 20, 20, 20)
        )
        em.persistAndFlush(course)

        val review = Review("5", "excellent","this is very useful course for kotlin beginner", course)
        em.persistAndFlush(review)
    }
}
