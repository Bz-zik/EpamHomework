package homework170811;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(indexOf(array, 6));
        System.out.println(indexOf(array, 5));
        System.out.println(indexOf(array, 10));
        System.out.println(indexOf(array, -10));
    }

    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return indexForInsert(a, key);
    }

    private static int indexForInsert(int[] a, int key) {
        int index = 0;
        while (key > a[index]) {
            index++;
            if (index >= a.length) return -a.length - 1;
        }
        return -index - 1;
    }
}
