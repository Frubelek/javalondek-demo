package pl.sda.javalondek4.java_demo.lambda.calculator;

import pl.sda.javalondek4.java_demo.lambda.playable.Playable;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with clac lambdas");

        Adder<Integer> adder = (a, b) -> {
            return a + b;
        };
        Adder<Integer> adder2 = (first, second) -> {
//            first.length(); - wrong type!!!
            return first + second;
        };

//        IDEAŁ \/
        Adder<Integer> adder3 = (first, second) -> first + second;
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

        Substraction<Integer> substraction = (a, b) -> a - b;
        Multiplication<Integer> multiplication = (a, b) -> a * b;
        Division<Double> division = (a, b) -> a / b;

        myAdder.addWithComment(5, 20, "should be 25");

        Operation<Double> divisionOperation = (a, b) -> a / b;

    }
}
