package homework170624;

import mytestframework.SimpleUnits;

public class TestSign {

    public static void main(String[] args) {

        System.out.println(SimpleUnits.assertEqual(MathUtils.sign(10), 1));
        System.out.println(SimpleUnits.assertEqual(MathUtils.sign(0), 0));
        System.out.println(SimpleUnits.assertEqual(MathUtils.sign(-10), -1));

        System.out.println(SimpleUnits.assertNotEqual(MathUtils.sign(0), -1));


    }

}
