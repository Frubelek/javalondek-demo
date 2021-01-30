package pl.sda.javalondek4.java_demo.optional.homework;

import java.util.Optional;

public class Display {

    private TextDisplaying textDisplaying;

    public Display(TextDisplaying textDisplaying) {
        this.textDisplaying = textDisplaying;
    }

    public Optional<TextDisplaying> getTextDisplaying() {
        return Optional.ofNullable(textDisplaying);
    }

    @Override
    public String toString() {
        return "Display{" +
                "textDisplaying=" + textDisplaying +
                '}';
    }

    public static String getDisplayedText(Home home) {
        return null;
    }

    public static void main(String[] args) {

        TextDisplaying<Integer> displayInHome2 = (HomeNumber) ->
                System.out.println("To się wyświetla w domu numer " + HomeNumber);

        Home nullHome = null;
        Home withoutInductionHob = new Home(new Kitchen(null));
        Home withBrokenDisplay = new Home(new Kitchen(new InductionHob(null)));
        Home displayInFirstHome = new Home(new Kitchen(new InductionHob
                (new Display(TextDisplaying.displayInHome))));

        getDisplayedText(nullHome);
        getDisplayedText(withoutInductionHob);
        getDisplayedText(withBrokenDisplay);
        getDisplayedText(displayInFirstHome);


        TextDisplaying.displayInHome.display(55);




//        TextDisplaying.textDisplaying.display("Tekst wyświetlony w domu nr 1");
    }
}
