package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with clac lambdas");

        Adder adder = (int a, int b) -> {
            return a + b;
        };
        Adder adder2 = (first, second) -> {
//            first.length(); - wrong type!!!
            return first + second;
        };

//        IDEAŁ \/
        Adder adder3 = (first, second) -> first + second;
//        IDEAŁ /\

        StrangeOne strangeOne = (int a, int b) -> {
            return a + b;
        };

        StringAdder stringAdder = ((one, two) -> {
            return one.concat(two);
        });

        MyAdder myAdder = (a, b, comment) -> {
            System.out.println(comment);
            return a + b;
        };

        Substraction substraction = (a, b) -> a - b;
        Multiplication multiplication = (a, b) -> a * b;
        Division division = (a, b) -> a / b;

        myAdder.addWithComment(5, 20, "should be 25");


    }
}
