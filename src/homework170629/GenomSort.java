package homework170629;

import datagenerator.GenomGenerator;

import java.util.Arrays;

public class GenomSort {

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
        String[] subDate = new String[data.length - w + 1];

        for (int i = 0; i < subDate.length; i++) {
            for (int j = i; j < i + w; j++) {
                if (subDate[i] == null) subDate[i] = "" + (char)data[j];
                else subDate[i] += (char)data[j];
            }
        }

        Arrays.sort(subDate);

//        for (String s :
//                subDate) {
//            System.out.println(s);
//        }

        int count = 0;

        for (int i = 1; i < subDate.length; i++) {
            if (subDate[i].equals(subDate[i-1])) count++;
            else {
                if (count != 0) {
                    System.out.println(subDate[i-1] + ": " + (count + 1) + " dublicates");
                    count = 0;
                }
            }
        }
    }


}
