package com.kiyotakeshi.springdataplayground.entity

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.TestConstructor
import java.time.LocalDate

@DataJpaTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
internal class PersonTest(
    private var em: TestEntityManager
) {

    @Test
    internal fun mapping() {
        val person = Person("mike", "tokyo", LocalDate.now())
        em.persistAndFlush(person);
    }
}
