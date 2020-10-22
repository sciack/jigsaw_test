package io.github.sciack.jigsaw.hello

interface Hello {
    fun sayHello(name: String): String
}

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Provide(val contentType: String)