package homework170809;

import homework170809.Dictionary.Pair;

public class UseDictionary {

    public static void main(String[] args) {

        Dictionary<String> d = new Dictionary<String>();

        d.put("Pete", "New York");
        d.put("John", "Boston");
        d.put("Вася", "Москва");
        d.put("Петя", "Москва");
        d.put("Боря", "Москва");
        d.put("Оля", "Москва");
        d.put("Жанна", "Москва");
        d.put("Маша", "Москва");
        d.put("Вано", "Москва");

        System.out.println(d.get("Ann"));
        System.out.println(d.get("John"));
        System.out.println(d.get("Вася"));

        d.put("Вася", "Петербург");
        System.out.println(d.get("Вася"));

        for (Pair pair : d) {
            System.out.println(pair.key + " : " + pair.value);
        }

    }

}