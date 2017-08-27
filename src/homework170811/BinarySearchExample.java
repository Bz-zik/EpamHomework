package homework170811;

import java.util.*;

public class BinarySearchExample {


    public static void main(String[] args) {


        List<A> listLinked = new LinkedList<>();
        List<A> listArray = new ArrayList<>();
        Set<A> setTree = new TreeSet<>();

        System.out.println("LinkedList : ");
        benchmark(listLinked);
        System.out.println("------------");

        System.out.println("ArrayList : ");
        benchmark(listArray);
        System.out.println("------------");



        System.out.println("TreeSet : ");
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            setTree.add(new A());
        }
        time1 = System.currentTimeMillis() - time1;

        A temp = new A();
        long time3 = System.currentTimeMillis();
        setTree.contains(temp);
        time3 = System.currentTimeMillis() - time3;
        System.out.println("time for add : " + time1 + " ms");
        System.out.println("time for sort : " + 0 + " ms");
        System.out.println("time for search " + temp + " : " + time3 + " ms");
        System.out.println("all time : " + (time1 + time3) + " ms");
        System.out.println("------------");


    }

    static void benchmark (List<A> list) {

        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(new A());
        }
        time1 = System.currentTimeMillis() - time1;

        long time2 = System.currentTimeMillis();
        Collections.sort(list);
        time2 = System.currentTimeMillis() - time2;

        A temp = new A();
        long time3 = System.currentTimeMillis();
        Collections.binarySearch(list, temp);
        time3 = System.currentTimeMillis() - time3;

        System.out.println("time for add : " + time1 + " ms");
        System.out.println("time for sort : " + time2 + " ms");
        System.out.println("time for search " + temp + " : " + time3 + " ms");
        System.out.println("all time : " + (time1 + time2 + time3) + " ms");

    }


}