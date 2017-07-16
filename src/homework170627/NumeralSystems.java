package homework170627;

import mytestframework.Asserts;

public class NumeralSystems {

    public static void main(String[] args) {

        System.out.println(Asserts.assertEqual(numeralSystemToBin(15679), Integer.toBinaryString(15679)));
        System.out.println(Asserts.assertEqual(numeralSystemToBin(0), Integer.toBinaryString(0)));
        System.out.println(Asserts.assertEqual(numeralSystemToBin(100), Integer.toBinaryString(100)));

        System.out.println(Asserts.assertEqual(numeralSystemToOct(15679), Integer.toOctalString(15679)));
        System.out.println(Asserts.assertEqual(numeralSystemToOct(0), Integer.toOctalString(0)));
        System.out.println(Asserts.assertEqual(numeralSystemToOct(100), Integer.toOctalString(100)));

        System.out.println(Asserts.assertEqual(numeralSystemToHex(15679), Integer.toHexString(15679)));
        System.out.println(Asserts.assertEqual(numeralSystemToHex(0), Integer.toHexString(0)));
        System.out.println(Asserts.assertEqual(numeralSystemToHex(100), Integer.toHexString(100)));

        System.out.println(Asserts.assertEqual(numeralSystems(15679, 3), Integer.toUnsignedString(15679, 3)));
        System.out.println(Asserts.assertEqual(numeralSystems(15679, 4), Integer.toUnsignedString(15679, 4)));
        System.out.println(Asserts.assertEqual(numeralSystems(15679, 5), Integer.toUnsignedString(15679, 5)));
        System.out.println(Asserts.assertEqual(numeralSystems(15679, 0), "failed: numeral system can't be less than 2"));
    }

    static String numeralSystemToBin(int x) {
        String result = "";

        while (x != 0) {
            result = x % 2 + result;
            x = x/2;
        }

        if ("".equals(result)) return "0";
        return result;
    }

    static String numeralSystemToOct(int x) {
        String result = "";

        while (x != 0) {
            result = x % 8 + result;
            x = x/8;
        }

        if ("".equals(result)) return "0";
        return result;
    }

    static String numeralSystemToHex(int x) {
        String result = "";

        while (x != 0) {
            switch (x % 16) {
                case 10:
                    result = "a" + result;
                    break;
                case 11:
                    result = "b" + result;
                    break;
                case 12:
                    result = "c" + result;
                    break;
                case 13:
                    result = "d" + result;
                    break;
                case 14:
                    result = "e" + result;
                    break;
                case 15:
                    result = "f" + result;
                    break;
                default:
                    result = x % 16 + result;
                    break;
            }

            x = x/16;
        }

        if ("".equals(result)) return "0";
        return result;
    }

    static String numeralSystems(int x, int num) {
        String result = "";

        if (num < 2) return "failed: numeral system can't be less than 2";
        if (num == 10) return Integer.toString(x);

        while (x != 0) {
            switch (x % num) {
                case 10:
                    result = "a" + result;
                    break;
                case 11:
                    result = "b" + result;
                    break;
                case 12:
                    result = "c" + result;
                    break;
                case 13:
                    result = "d" + result;
                    break;
                case 14:
                    result = "e" + result;
                    break;
                case 15:
                    result = "f" + result;
                    break;
                default:
                    result = x % num + result;
                    break;
            }

            x = x/num;
        }

        if ("".equals(result)) return "0";
        return result;
    }
}
