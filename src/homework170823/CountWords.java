package homework170823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CountWords {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "one", "two", "two", "three");

        countWords(list);
        System.out.println();

        // with my Functional Interface
//        WordsCountable countFI = (list1) -> CountWords.countWords(list1);
        WordsCountable countFI = CountWords::countWords;
        countFI.count(list);
        System.out.println();

        // with Functional Interface
        Consumer<List<String>> consumer = CountWords::countWords;
        consumer.accept(list);
        System.out.println();

        // with stream
        Stream<List<String>> stream = Stream.of(list);
        stream.forEach(CountWords::countWords);
        System.out.println();

    }


    private static void countWords(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s :
                list) {
            if (map.get(s) == null) {
                map.put(s, 1);
            }
            else map.replace(s, map.get(s)+1);
        }

        print(map);
    }

    public static void print(HashMap<String, Integer> map) {
        map.entrySet().forEach(pair -> System.out.println(pair.getKey() + " : " + pair.getValue()));
    }

    @FunctionalInterface
    interface WordsCountable {
        void count(List<String> list);
    }
}
