package lab4;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 10, 6, 14};
        int key1 = 3;
        System.out.println("Key " + key1 + " found at index: " + linearSearchIndex(array, key1));
        int key2 = 12;
        System.out.println("Key " + key2 + " is found inside array: " + linearSearch(array, key2));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int count = 0; count < array.length; count++) {
            if (array[count] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int count = 0; count < array.length; count++) {
            if (array[count] == key) {
                return count;
            }
        }
        return 0;
    }
}
