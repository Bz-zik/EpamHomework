package homework170712;

import mytestframework.Asserts;

public class TestStringStack {

    public static void main(String[] args) {

        StringStack stack = new StringStack();

        System.out.println(stack);
        System.out.println(Asserts.assertEqual(stack.push("one"), true));
        System.out.println(Asserts.assertEqual(stack.push("two"), true));
        System.out.println(Asserts.assertEqual(stack.push("three"), true));

        System.out.println(Asserts.assertEqual(stack.size(), 3));

        System.out.println(stack);

        System.out.println(Asserts.assertEqual(stack.tos(), "three"));

        System.out.println(Asserts.assertEqual(stack.pop(), "three"));
        System.out.println(Asserts.assertEqual(stack.pop(), "two"));
        System.out.println(Asserts.assertEqual(stack.pop(), "one"));
        System.out.println(Asserts.assertEqual(stack.pop(), null));

        System.out.println(Asserts.assertEqual(stack.pop(), null));


        System.out.println(Asserts.assertEqual(stack.size(), 0));


    }


}
