package oata;

public class CoverityNullDeref {
    public static int getMessageLength(String input) {
        String value = input;

        if (value == null) {
            return value.length();
        }

        return value.length();
    }
}
