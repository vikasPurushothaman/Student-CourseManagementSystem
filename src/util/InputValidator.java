package util;

public class InputValidator {

    public static int paraseint(String input) {
        try{
                return Integer.parseInt(input);
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Invalid number input");
        }
    }
}


