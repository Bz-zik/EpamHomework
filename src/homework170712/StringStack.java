package homework170712;

import java.util.Arrays;

public class StringStack {

    private static final int DEFAULT_MAX_SIZE = 10;
    private String[] elements;
    private int size;

    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int size) {
        elements = new String[size];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean push(String s) {

        if (size >= elements.length) {
            return false;
        }
        elements[size++] = s;
        return true;
    }

    public String pop() {

        if (size <= 0) {
            return null;
        }
        String result = elements[--size];
        elements[size] = null;
        return result;
    }

    public String tos() {
        return size <= 0 ? null : elements[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }

}
