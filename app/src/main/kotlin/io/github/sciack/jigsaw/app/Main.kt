package io.github.sciack.jigsaw.app

import io.github.sciack.jigsaw.hello.Hello
import io.github.sciack.jigsaw.hello.Provide

import java.util.*

object Main {

    @JvmStatic
    fun main(vararg args:String ) {
        ServiceLoader.load(Hello::class.java).filter {
            it::class.annotations.any{ annotation ->
                annotation is Provide && annotation.contentType == "html"
            }
        }.forEach {
            println(it.sayHello("to Zuhlkes"))
        }
    }
}