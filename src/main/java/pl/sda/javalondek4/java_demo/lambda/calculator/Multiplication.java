package pl.sda.javalondek4.java_demo.lambda.calculator;

@FunctionalInterface
public interface Multiplication<T> {
    T multiplication(T a, T b);
}
