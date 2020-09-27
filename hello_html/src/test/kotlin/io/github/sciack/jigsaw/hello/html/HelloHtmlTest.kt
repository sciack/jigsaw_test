package io.github.sciack.jigsaw.hello.html

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class HelloHtmlTest {
    @Test
    fun `testHello`() {
        assertTrue(
            HelloHtml().sayHello("to you").contains("Hello to you")
        )
    }
}