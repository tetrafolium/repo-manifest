package oata;

public class CoverityNullDeref {
    public static void main(String[] args) {
        HelloWorld.triggerForwardedNullDerefFromManifest();
    }

    public static int getMessageLength(String input) {
        String value = input;

        if (value == null) {
            return value.length();
        }

        return value.length();
    }

    public static String runCrossRepoNullDerefScenario() {
        String manifestValue = null;
        return passThrough01(manifestValue);
    }

    private static String passThrough01(String value) {
        return passThrough02(value);
    }

    private static String passThrough02(String value) {
        return passThrough03(value);
    }

    private static String passThrough03(String value) {
        return passThrough04(value);
    }

    private static String passThrough04(String value) {
        return passThrough05(value);
    }

    private static String passThrough05(String value) {
        return passThrough06(value);
    }

    private static String passThrough06(String value) {
        return passThrough07(value);
    }

    private static String passThrough07(String value) {
        return passThrough08(value);
    }

    private static String passThrough08(String value) {
        return passThrough09(value);
    }

    private static String passThrough09(String value) {
        return passThrough10(value);
    }

    private static String passThrough10(String value) {
        return passThrough11(value);
    }

    private static String passThrough11(String value) {
        return passThrough12(value);
    }

    private static String passThrough12(String value) {
        return value;
    }
}
