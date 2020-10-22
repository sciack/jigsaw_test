package io.github.sciack.jigsaw.hello.impl

import io.github.sciack.jigsaw.hello.Hello
import io.github.sciack.jigsaw.hello.Provide

@Provide("text")
class HelloImpl constructor() : Hello {
    override fun sayHello(name: String) = "Hello $name"
}