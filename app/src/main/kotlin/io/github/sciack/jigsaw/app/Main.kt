package io.github.sciack.jigsaw.app

import io.github.sciack.jigsaw.hello.Hello
import java.util.*

fun main() {
    ServiceLoader.load(Hello::class.java).forEach{
        println(it::class.qualifiedName)
        println(it.sayHello("to you"))
    }
}