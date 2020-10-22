module test.jigsaw.app.main {
    requires kotlin.stdlib;
    requires test.jigsaw.hello.provider.main;
    requires test.jigsaw.hello.main;
    requires kotlin.reflect;
    uses io.github.sciack.jigsaw.hello.Hello;
}