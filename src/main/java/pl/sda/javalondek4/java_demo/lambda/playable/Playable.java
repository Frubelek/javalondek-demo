package pl.sda.javalondek4.java_demo.lambda.playable;

// Homework
//1). Przećwiczcie git'a (to co było na zajęciach) tak abyśmy na kolejnych zajęciach mogli jechać dalej.
//2). Stwórz własny interfejs funkcyjny Playable z jedną metodą play:
//	- zdefiniuj 3 lambdy przy jego użyciu
//	- footballPlayer
//	- gamesPlayer
//	- looser:)
//	- zachowanie dowolne (Ty masz kierownicę)
//	- staraj sie nie korzystać z pomocy IJ - ale pisz samodzielnie.

@FunctionalInterface
public interface Playable<text> {
    String play(String text);
}

