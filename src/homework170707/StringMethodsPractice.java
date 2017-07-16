package homework170707;

import mytestframework.Asserts;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String s = "   Hello ";
        String s2 = "Hello";  // trimmed
        String s3 = "  Hello";
        String s4 = "Hello  ";
        String s5 = "  He l l o  ";
        String s6 = "";

        // test 1
        System.out.println("test 1: " + Asserts.assertEqual(trim(s), "Hello"));
        // test 2
        System.out.println("test 2: " + Asserts.assertEqual(trim(s2), "Hello"));
        // test 3
        System.out.println("test 3: " + Asserts.assertEqual(trim(s3), "Hello"));
        // test 4
        System.out.println("test 4: " + Asserts.assertEqual(trim(s4), "Hello"));
        // test 5
        System.out.println("test 5: " + Asserts.assertEqual(trim(s5), "He l l o"));
        // test 6
        System.out.println("test 6: " + Asserts.assertEqual(trim(s6), ""));

    }


    public static String trim(String s) {

        if (s == null || s.length() == 0) return s;

        if (s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1) return s;

        int firstIndex = 0;
        int lastIndex = s.length() - 1;

        while (s.charAt(firstIndex++) == ' ');
        while (s.charAt(lastIndex--) == ' ');

        return s.substring(firstIndex - 1, lastIndex + 2);
    }


}
