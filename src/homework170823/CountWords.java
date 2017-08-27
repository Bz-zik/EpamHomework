package homework170823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountWords {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "one", "two", "two", "three");

        HashMap<String, Integer> map = countWords(list);
        print(map);

    }

    private static HashMap<String, Integer> countWords(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s :
                list) {
            if (map.get(s) == null) {
                map.put(s, 1);
            }
            else map.put(s, map.get(s)+1);
        }

        return map;
    }

    public static void print(HashMap<String, Integer> map) {
        map.entrySet().forEach(pair -> System.out.println(pair.getKey() + " : " + pair.getValue()));
    }

}
