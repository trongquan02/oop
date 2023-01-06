package lab2;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Array To String is: " + arrayToString(array));
    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return null;
        }
        StringBuilder arrayString = new StringBuilder();
        arrayString.append('[');
        for (int i = 0; i < array.length - 1; i++) {
            arrayString.append(array[i]).append(", ");
        }
        arrayString.append(array[array.length - 1]).append("]");
        return arrayString.toString();
    }
//        String result = "";
//        if (array.length > 1) {
//            for (int i = 0; i < array.length; i++) {
//                if (i == 0) {
//                    result = result + "[" + array[i];
//                } else if (i == array.length - 1) {
//                    result = result + ", " + array[i] + "]";
//                } else {
//                    result = result + ", " + array[i];
//                }
//            }
//        } else if (array.length == 1) {
//            result = result + "[" + array[0] + "]";
//        } else {
//            result = result + "[]";
//        }
//        return result;
//        StringBuilder arrayString = new StringBuilder();
//        arrayString.append('[');
//        for (int i = 0; i < s.length() - 1; i++) {
//            arrayString.append(array[i]).append(", ");
//        }
//        arrayString.append(array[array.length - 1]).append("]");
}
