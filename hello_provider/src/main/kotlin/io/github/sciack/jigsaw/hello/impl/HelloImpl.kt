package io.github.sciack.jigsaw.hello.impl

import io.github.sciack.jigsaw.hello.Hello

class HelloImpl constructor(): Hello {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

}