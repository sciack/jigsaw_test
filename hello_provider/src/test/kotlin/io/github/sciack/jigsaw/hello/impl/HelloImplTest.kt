package io.github.sciack.jigsaw.hello.impl

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloImplTest {
    @Test
    fun `testHello`() {
        HelloImpl().sayHello("to you")
    }
}