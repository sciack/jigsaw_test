package io.github.sciack.jigsaw.hello.html

import io.github.sciack.jigsaw.hello.Hello

class HelloHtml constructor() : Hello {
    override fun sayHello(name: String): String = """
<html>
    <body>
        <strong>Hello $name</strong>
    </body>
</html>
"""
}
