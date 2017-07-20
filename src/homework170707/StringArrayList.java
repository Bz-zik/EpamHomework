package homework170707;

import java.util.Arrays;

public class StringArrayList {

    static final int DEFAULT_SIZE = 2;

    String[] elements = new String[DEFAULT_SIZE];


    int size = 0;

    public void add(String string) {

        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = string;
//		size = size + 1;
    }

    @Override
    public String toString() {
        if (size < 1) return "[]";

        String result = "[";

        for (int i = 0; i < size; i++) {
            result += elements[i];
            if (i == size - 1) result += "]";
            else result += ", ";
        }

        return result;
    }


    public void remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }

        System.arraycopy(elements, i+1, elements, i, --size - i);
        elements[size] = null;
    }

    public void remove(String s) {

        for (int i = 0; i < size; i++) {
            if (s.equals(elements[i])) {
                remove(i);
                i--;
            }
        }
    }

    public String get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return elements[i];
    }

    public void set(int i, String s) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }

        elements[i] = s;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
