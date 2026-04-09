package oata;

public class HelloWorld {
    public static int selfContainedNullDeref() {
        String local = null;
        return local.length();
    }

    public static void main(String[] args) {
        String s = null;
        CrossRepoSink.consume(s);
        System.out.println("Hello World");
    }
}
