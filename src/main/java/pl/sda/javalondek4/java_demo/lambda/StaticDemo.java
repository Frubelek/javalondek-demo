package pl.sda.javalondek4.java_demo.lambda;

public class StaticDemo {

    public static void demo() {
        System.out.println("static demo");
    }

    public void crash() {
        System.out.println("no to bum:)");
    }
    public static void main(String[] args) {
        demo(); // ponieważ jesteśmy w tej klasie
        StaticDemo.demo(); // normalnie gdybyśmy byli rowniez w innej klasie

        StaticDemo empty = null;
        empty.demo(); // StaticDemo.demo();
        empty.crash();
    }
}
