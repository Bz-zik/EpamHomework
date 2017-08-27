package homework170809;

import homework170809.Dictionary.Pair;
import static mytestframework.Asserts.assertEqual;

public class UseDictionary {

    public static void main(String[] args) {

        Dictionary<String, String> d = new Dictionary<>();

        d.put("Pete", "New York");
        d.put("John", "Boston");
        d.put("Вася", "Москва");
        d.put("Петя", "Москва");

        System.out.println(d.get("Ann"));
        System.out.println(d.get("John"));
        System.out.println(d.get("Вася"));

        d.put("Вася", "Петербург");
        System.out.println(assertEqual("Петербург", d.get("Вася"))); // TDD
        System.out.println();

        for (Pair pair : d) {
            System.out.println(pair.key + " : " + pair.value);
        }
        System.out.println();
        System.out.println(assertEqual(true, d.remove("Вася"))); // TDD
        System.out.println(assertEqual(false, d.remove("Юра"))); // TDD
        System.out.println();

        for (Pair pair : d) {
            System.out.println(pair.key + " : " + pair.value);
        }

    }

}