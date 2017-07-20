package homework170707;

import java.util.ArrayList;

public class UseStringArrayList {

    public static void main(String[] args) {
        StringArrayList list = new StringArrayList();

        System.out.println(list.isEmpty());

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println(list.toString());

        list.remove(1);
        System.out.println(list.toString());

        list.remove("three");
        System.out.println(list.toString());

        System.out.println(list.get(1));


        list.set(1, "two");
        System.out.println(list.toString());

        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }

}
