package homework170624;

import mytestframework.Asserts;

public class TestIsPrime {

    public static void main(String[] args) {
        System.out.println(Asserts.assertEqual(MathUtils.isPrime(1), false));
        System.out.println(Asserts.assertEqual(MathUtils.isPrime(2), false));
        System.out.println(Asserts.assertEqual(MathUtils.isPrime(3), true));
        System.out.println(Asserts.assertEqual(MathUtils.isPrime(4), false));
        System.out.println(Asserts.assertEqual(MathUtils.isPrime(5), true));

        System.out.println(Asserts.assertNotEqual(MathUtils.isPrime(7), false));
        System.out.println(Asserts.assertNotEqual(MathUtils.isPrime(10), true));
    }

}
