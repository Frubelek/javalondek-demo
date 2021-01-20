package pl.sda.javalondek4.java_demo.lambda.playable;

public class Play {
    public static void main(String[] args) {

        Playable footballPlayer = (text) -> {
            System.out.println(text);
            return text;
        };
        Playable gamePlayer = (text) -> {
            System.out.println(text);
            return text;
        };
        Playable looser = (text) -> {
            System.out.println(text);
            return text;
        };

        footballPlayer.play("Are you a football player?");
        gamePlayer.play("Or are you a real nerd?");
        looser.play("If none of the above ... then you are a looser ;)");


    }
}
