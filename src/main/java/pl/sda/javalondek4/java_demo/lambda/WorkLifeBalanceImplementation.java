package pl.sda.javalondek4.java_demo.lambda;

public class WorkLifeBalanceImplementation implements WorkLifeBalance {

    @Override
    public void hardWork() {
        System.out.println("Go to work!");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Time to sleep.");
    }
}
