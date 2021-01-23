package pl.sda.javalondek4.java_demo.exception;

public class ExceptionExample {

    //      checked exeptione - all inherited from Exception but not RuntimeException
    //      unchecked exceptions - all inherited from RuntimeException
    //      errors - inherited directly from Throwable
    public static void main(String[] args)
//            throws NoNickException
    {
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        /// handle or declare
        // SOLID??
        String myNick;
        try { // first step
            myNick = exceptionGenerator.nick();
        } catch (NoNickException e) { // second - dometimes
            System.out.println("Problem with nick generator...");
            myNick = "this user have no nick";
        } finally { //third // always
            // myNick = "from finally; // it always overrides nick :(
        }
        System.out.println("my nick is: " + myNick);

        System.out.println("Now with runtime exceptions...");
        try {
            myNick = exceptionGenerator.nickWithRuntimeException();
        }catch (NoNickRuntimeException e){
            System.out.println("wyjatek z RuntimeException");
            myNick = "Przypisanie z runtimeExcepion";
        }
        System.out.println("My nick is: " + myNick);

//        String nullString = null;
//        nullString.concat(" ma kota");

        System.out.println("With dealer :)");
        NickDealer nickDealer = new NickDealer(new ExceptionGenerator());

        String myNickDealer;
        try {
            myNickDealer = nickDealer.nickFromDealer();
        } catch (NoNickException e) {
            myNickDealer = "default nick name";
        }
        System.out.println("Nick from myDealer");

        try {
            myNickDealer = nickDealer.nick();
        } catch (NoNickRuntimeException exc) {
            myNickDealer = "unexpected value ...";
        }
        System.out.println("Nick from dealer: " + myNickDealer);

        System.out.println("here?");
    }
}
