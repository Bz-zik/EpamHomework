package datagenerator;

import java.util.Random;

public class ArrayGenerator {

    public static int[] arrayGenerator()
    {
        Random random = new Random();

        int[] array = new int[random.nextInt(10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }

        return array;
    }

}
