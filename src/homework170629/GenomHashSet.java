package homework170629;

import datagenerator.GenomGenerator;

import java.util.HashSet;

public class GenomHashSet {

    public static void main(String[] args) {
        byte[] data = GenomGenerator.generate(5000);

        for (byte b :
                data) {
            System.out.print((char)b);
        }

        System.out.println();

        long start = System.currentTimeMillis();

        findDuplicates(data, 5);

        long finish = System.currentTimeMillis();

        System.out.println((finish - start) + " ms in work");


    }

    private static void findDuplicates(byte[] data, int w) {

        HashSet<String> subDate = new HashSet<>();
        String temp = "";
        for (int i = 0; i < data.length - w + 1; i++) {
            for (int j = i; j < i + w; j++) {
                temp += (char)data[j];
            }
            if (subDate.contains(temp)) System.out.println("Duplicate was found: i = " + i + " " + temp);
            else subDate.add(temp);
            temp = "";
        }

    }

}
