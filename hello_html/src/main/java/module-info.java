module test.jigsaw.hello.html.main {
    requires kotlin.stdlib;
    requires test.jigsaw.hello.main;
    provides io.github.sciack.jigsaw.hello.Hello
            with io.github.sciack.jigsaw.hello.html.HelloHtml;
}