package lab8.lists;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(list.size(), value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(i);
            }
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> squareNumber = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int number = i * i;
            squareNumber.add(number);
        }
        return squareNumber;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                return true;
            }
        }

        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if (target == null) {
            for (int i = 0; i < source.size(); i++) {
                target.add(source.get(i));
            }
        } else {
            target = new ArrayList<>();
            for (int i = 0; i < source.size(); i++) {
                target.add(source.get(i));
            }
        }

    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        list = list1;

    }

    public static void insertBeginingEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

}
