package homework170624;

import mytestframework.Asserts;

public class TestMod {

    public static void main(String[] args) {

        System.out.println(Asserts.assertEqual(MathUtils.mod(10, 10), 10 % 10));
        System.out.println(Asserts.assertEqual(MathUtils.mod(0, 10), 0 % 10));
        System.out.println(Asserts.assertEqual(MathUtils.mod(100, 11), 100 % 11));
        System.out.println(Asserts.assertEqual(MathUtils.mod(10, 5), 10 % 5));

    }

}
