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

//        System.out.println("trim test 1: " + Asserts.assertEqual(trim(s), "Hello"));
//        System.out.println("trim test 2: " + Asserts.assertEqual(trim(s2), "Hello"));
//        System.out.println("trim test 3: " + Asserts.assertEqual(trim(s3), "Hello"));
//        System.out.println("trim test 4: " + Asserts.assertEqual(trim(s4), "Hello"));
//        System.out.println("trim test 5: " + Asserts.assertEqual(trim(s5), "He l l o"));
//        System.out.println("trim test 6: " + Asserts.assertEqual(trim(s6), ""));


        System.out.println("replace test 1: " + Asserts.assertEqual(replace(s6, 'e', 'a'), ""));
        System.out.println("replace test 2: " + Asserts.assertEqual(replace(s2, 'a', 'e'), "Hello"));
        System.out.println("replace test 3: " + Asserts.assertEqual(replace(s2, 'e', 'a'), "Hallo"));
        System.out.println("replace test 4: " + Asserts.assertEqual(replace(s2, 'l', 'p'), "Heppo"));
        System.out.println("replace test 5: " + Asserts.assertEqual(replace(s2, 'l', 'l'), "Hello"));

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

    public static String replace(String s, char oldChar, char newChar) {

        String result = "";

        if (s == null || s.length() == 0 || oldChar == newChar) return s;

        if (s.indexOf(oldChar) < 0) return s;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != oldChar) result += s.charAt(i);
            else result += newChar;
        }

        return result;

    }


}
