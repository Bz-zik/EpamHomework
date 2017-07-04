package homework170629;

public class GenomCycle {

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
        for (int i = 0; i < data.length - w; i++) {
            for (int j = i+1; j < data.length - w + 1; j++) {
                for (int k = 0; k < w; k++) {
                    if (data[i+k] != data[j+k])
                        break;
                    if (k == w-1)
                        System.out.println("i = " + i + ", j = " + j);
                }
            }

        }
    }
}
