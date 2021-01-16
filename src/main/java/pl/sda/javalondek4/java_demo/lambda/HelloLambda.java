package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        PaweRunner paweRunner = new PaweRunner();
        PaweRunner.walk();

        Runner runner = new PaweRunner();
        runner.go();

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anonymous runner!");
            }
        };
        anonymousRunner.go();

    }
}
