package com.kiyotakeshi.springdataplayground.entity

import com.kiyotakeshi.springdataplayground.repository.CourseRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.TestConstructor
import java.time.LocalDateTime

@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
internal class CourseTest(
    private var em: TestEntityManager,
    private var courseRepository: CourseRepository
) {
    @Test
    // @DirtiesContext
    internal fun mapping() {
        val course =
            Course(
                "kotlin-beginner",
                lastUpdateDate = LocalDateTime.now(),
                createdDate = LocalDateTime.of(2021, 11, 20, 20, 20)
            )
        em.persistAndFlush(course)
    }

    @Test
    internal fun retrieve() {
        val course = courseRepository.findById(100L).orElseThrow()
        assertThat(course.name).isEqualTo("kotlin-beginner")
    }
}
