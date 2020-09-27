package io.github.sciack.jigsaw.app

import io.github.sciack.jigsaw.hello.Hello
import java.util.*

fun main(vararg args: String) {
    ServiceLoader.load(Hello::class.java).findFirst().ifPresent {
        it.sayHello("to you")
    }
}