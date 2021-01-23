package pl.sda.javalondek4.java_demo.lambda;

public class PaweRunner implements Runner {

    @Override
    public void go() {
        System.out.println("Run Pawel, run!");
    }

    @Override
    public void go(int speed) {
        System.out.println("Pawel speed is " + speed);
    }

    public static void walk() {
        System.out.println("walk Pawel...");
    }
}
