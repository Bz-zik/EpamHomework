package homework170704;

import static datagenerator.ArrayGenerator.arrayGenerator;

public class ArrayPrint {

    public static void main(String[] args) {

        int[] array = arrayGenerator();

        arrayPrintFor(array);

        arrayPrintWhile(array);
    }

    public static void arrayPrintWhile(int[] array) {
        System.out.print("while [");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            if (i != array.length - 1)
                System.out.print(", ");
            i++;
        }
        System.out.println("]");
    }

    public static void arrayPrintFor(int[] array) {
        System.out.print("for: [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

}
