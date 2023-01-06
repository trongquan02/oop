package lab4;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 7, 8, 14, 19, 22, 23, 55};
        int key = 7;
        System.out.println(binarySearch(array, key, 0, array.length - 1));
    }

    public static boolean binarySearch(int[] array, int key, int firstIdx, int lastIdx) {
        if (firstIdx == lastIdx - 1) {
            if (key == array[firstIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleIdx = (firstIdx + lastIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                lastIdx = middleIdx;
            } else {
                firstIdx = middleIdx + 1;
            }
            return binarySearch(array, key, firstIdx, lastIdx);
        }
    }

}
