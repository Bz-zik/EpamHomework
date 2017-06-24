package homework170624;

public class TestIsPrime {

    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(1), false));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(2), false));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(3), true));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(4), false));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(5), true));

        System.out.println(SimpleUnit.assertNotEqual(MathUtils.isPrime(7), false));
        System.out.println(SimpleUnit.assertNotEqual(MathUtils.isPrime(10), true));
    }

}
