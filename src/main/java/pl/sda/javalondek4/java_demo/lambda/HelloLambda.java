package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {

    public static void main(String[] args) {
        PaweRunner paweRunner = new PaweRunner();
        PaweRunner.walk();
        Runner runner = new PaweRunner();
        handleRunner(runner);
//        runner.walk(); - dosen't compile

        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anonymous runner!");
            }
        };
        handleRunner(anonymousRunner);

        // call handleRunner user anonymous class
        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("Anonymous runner");
            }
        });
    }

    public static void handleRunner(Runner anyRunner) {
        System.out.println("handleRunner()");

        anyRunner.go();
    }
}
