package pl.sda.javalondek4.java_demo.optional.homework;

@FunctionalInterface
public interface TextDisplaying<T> {
    void display(T t);

    TextDisplaying<Integer> displayInHome = (HomeNumber) ->
            System.out.println("To się wyświetla w domu numer " + HomeNumber);



    //    TextDisplaying<String> textDisplaying = (text) -> {
//        System.out.println(text);
//    };
}
