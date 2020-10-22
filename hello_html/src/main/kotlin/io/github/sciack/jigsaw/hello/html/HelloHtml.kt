package io.github.sciack.jigsaw.hello.html

import io.github.sciack.jigsaw.hello.Hello
import io.github.sciack.jigsaw.hello.Provide

@Provide("html")
class HelloHtml constructor() : Hello {
    override fun sayHello(name: String): String = """
<html>
    <body>
        <strong>Hello $name</strong>
    </body>
</html>
"""
}
