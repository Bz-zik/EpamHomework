package homework170809;

public class BenchmarkDictionary {

    public static void main(String[] args) {

        Dictionary<String, String> dictionary = new Dictionary<>();
        Dictionary<String, String> dictionary1 = new Dictionary<>();
        Dictionary<String, String> dictionary2 = new Dictionary<>();

        System.out.println(putAll(dictionary, 1000) + " ms");
        System.out.println(deleteAll(dictionary, 1000) + " ms");
        System.out.println("-----------");

        System.out.println(putAll(dictionary1, 10000) + " ms");
        System.out.println(deleteAll(dictionary1, 10000) + " ms");
        System.out.println("-----------");

        System.out.println(putAll(dictionary2, 100000) + " ms");
        System.out.println(deleteAll(dictionary2, 100000) + " ms");
        System.out.println("-----------");


    }

    public static long putAll(Dictionary<String, String> dictionary, int i) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < i; j++) {
            dictionary.put(j+"", j+"");
        }
        long finish = System.currentTimeMillis();
        return finish-start;
    }

    public static long deleteAll(Dictionary<String, String> dictionary, int i) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < i; j++) {
            dictionary.remove(j+"");
        }
        long finish = System.currentTimeMillis();
        return finish-start;
    }

}
