package io.github.sciack.jigsaw.app

import io.github.sciack.jigsaw.hello.Hello
import java.util.*

object Main {

    @JvmStatic
    fun main(vararg args:String ) {
        println("Starting application")
        ServiceLoader.load(Hello::class.java).forEach {
            println(it::class.qualifiedName)
            println(it.sayHello("to you"))
        }
        println("end")
    }
}