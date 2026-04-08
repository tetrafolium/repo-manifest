package oata;

public class HelloWorld {
    public static void main(String[] args) {
        String s = null;
        CrossRepoSink.consume(s);
        System.out.println("Hello World");
    }
}
