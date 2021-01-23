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
            myNick= exceptionGenerator.nickWithRuntimeException();
        }catch (NoNickRuntimeException e){
            System.out.println("wyjatek z RuntimeException");
            myNick = "Przypisanie z runtimeExcepion";
        }
        System.out.println("My nick is: " + myNick);

//        String nullString = null;
//        nullString.concat(" ma kota");

        System.out.println("here?");    // ta linijka się nie wydrukuje
    }
}
