package homework170624;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946... - Fibonacci number

public class TestIsFibonacci {

    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacci(0), true));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacci(1), true));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacci(2), true));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacci(3), true));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacci(5), true));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacci(6), false));
        System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacci(13), true));

        System.out.println(SimpleUnit.assertNotEqual(MathUtils.isFibonacci(34), false));
        System.out.println(SimpleUnit.assertNotEqual(MathUtils.isFibonacci(1000), true));
        System.out.println(SimpleUnit.assertNotEqual(MathUtils.isFibonacci(0), false));
    }

}
