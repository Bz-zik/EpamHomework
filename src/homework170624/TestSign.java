package homework170624;

import mytestframework.Asserts;

public class TestSign {

    public static void main(String[] args) {

        System.out.println(Asserts.assertEqual(MathUtils.sign(10), 1));
        System.out.println(Asserts.assertEqual(MathUtils.sign(0), 0));
        System.out.println(Asserts.assertEqual(MathUtils.sign(-10), -1));

        System.out.println(Asserts.assertNotEqual(MathUtils.sign(0), -1));


    }

}
