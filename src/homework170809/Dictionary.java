package homework170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Dictionary<K, V> implements Iterable<Dictionary<K, V>.Pair> {

    private static final int MAX = 3;
    private int size = 0;

    public class Pair {
        K key;
        V value;
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }


    private List<Pair>[] data = new List[MAX];

    public V get(K key) {
        Pair pair = getPair(key);
        return pair == null ? null : pair.value;
    }

    public int getSize() {
        return size;
    }

    public void put(K key, V value) {

        if (size >= data.length) resize();

        int index = hash(key);
        if (data[index] == null) {
            data[index] = new ArrayList<>();
        }

        Pair pair = getPair(key);

        if (pair == null) {
            data[index].add(new Pair(key, value));
            size++;
            return;
        }

        pair.value = value;

    }

    public boolean remove(K key) {
        int index = hash(key);
        boolean result = false;
        if (data[index] != null) {
            result = data[index].remove(getPair(key));
            if (result) size--;
        }
        return result;
    }

    private Pair getPair(K key) {
        int index = hash(key);
        return getPair(index, key);
    }

    private Pair getPair(int index, K key) {
        List<Pair> list = data[index];
        if (list == null) { // guard condition
            return null;
        }
        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                return pair;
            }
        }

        return null;
    }

    private void resize() {
        Dictionary<K, V> dictionary = new Dictionary<>();
        dictionary.data = new List[data.length*3/2];
        for (Pair pair : this) {
            dictionary.put(pair.key, pair.value);
        }
        data = dictionary.data;
    }


    private int hash(K key) {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        for(Pair pair : this) {
            string.append(pair.key).append(" : ").append(pair.value).append("\n");
        }
        return string.toString();
    }

    @Override
    public Iterator<Pair> iterator() {
        return new Iterator<Pair>() {
            int currentElement = -1;
            Iterator<Pair> listIterator = null;

            @Override
            public boolean hasNext() {

                if (listIterator != null && listIterator.hasNext()) {
                    return true;
                }

                listIterator = null;

                for (++currentElement; listIterator == null
                        && currentElement < data.length; currentElement++) {
                    List<Pair> list = data[currentElement];
                    if (list == null) {
                        continue;
                    }
                    listIterator = list.iterator();
                    if (!listIterator.hasNext()) {
                        continue;
                    }
                    return listIterator.hasNext();
                }

                return false;
            }

            @Override
            public Pair next() {
                if (!hasNext()) {
                    throw new IllegalArgumentException();
                }
                return listIterator.next();
            }
        };
    }

}