module test.jigsaw.app.main {
    requires test.jigsaw.hello.main;
    requires kotlin.stdlib;
    uses io.github.sciack.jigsaw.hello.Hello;
}