package io.github.sciack.jigsaw.hello.impl

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


internal class HelloImplTest {
    @Test
    fun testHello() {
        assertTrue(
            HelloImpl().sayHello("to you").contains("Hello to you")
        )
    }
}