package mytestframework;

public class SimpleUnits {

    public static boolean assertEqual(String actual, String expected) {

        boolean result = false;

        if (actual != null && expected != null)
            if (actual.equals(expected)) result = true;

        if (!result) System.err.println("Test assertEqual failed: actual " + actual + ", but expected " + expected);

        return result;
    }

    public static boolean assertNotEqual(String actual, String expected) {

        boolean result = false;

        if (actual != null && expected != null)
            if (!actual.equals(expected)) result = true;

        if (!result) System.err.println("Test assertNotEqual failed: actual " + actual + ", but expected " + expected);

        return result;
    }


    public static boolean assertEqual(int actual, int expected) {

        boolean result = actual == expected ? true : false;

        if (!result) System.err.println("Test assertEqual failed: actual " + actual + ", but expected " + expected);

        return result;
    }

    public static boolean assertNotEqual(int actual, int expected) {

        boolean result = actual != expected ? true : false;

        if (!result) System.err.println("Test assertNotEqual failed: actual " + actual + ", but expected " + expected);

        return actual != expected ? true : false;
    }

    public static boolean assertEqual(boolean actual, boolean expected) {

        boolean result = actual == expected ? true : false;

        if (!result) System.err.println("Test assertEqual failed: actual " + actual + ", but expected " + expected);

        return result;
    }

    public static boolean assertNotEqual(boolean actual, boolean expected) {

        boolean result = actual != expected ? true : false;

        if (!result) System.err.println("Test assertNotEqual failed: actual " + actual + ", but expected " + expected);

        return actual != expected ? true : false;
    }
}
