package lab2;

public class Print {
    public static void main(String[] args) {
        int[] array_int = {1, 2, 3, 4, 5};
        double[] array_double = {1.2, 1.6, 4.5};
        float[] array_float = {1.2f, 2.6f, 5.6f};
        System.out.println("Array integer: ");
        print(array_int);
        System.out.println("Array double: ");
        print(array_double);
        System.out.println("Array float: ");
        print(array_float);

    }

    public static void print(int[] array) {
        if (array == null) {
            return;
        }
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i] + " ");
                } else if (i == array.length - 1) {
                    System.out.println(", " + array[i] + "]");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        } else if (array.length == 1) {
            System.out.println("[" + array[0] + "]");
        } else {
            System.out.println("[]");
        }

    }

    public static void print(float[] array) {
        if (array == null) {
            return;
        }
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i] + " ");
                } else if (i == array.length - 1) {
                    System.out.println(", " + array[i] + "]");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        } else if (array.length == 1) {
            System.out.print("[" + array[0] + "]");
        } else {
            System.out.print("[]");
        }
    }

    public static void print(double[] array) {
        if (array == null) {
            return;
        }
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i] + " ");
                } else if (i == array.length - 1) {
                    System.out.println(", " + array[i] + "]");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        } else if (array.length == 1) {
            System.out.println("[" + array[0] + "]");
        } else {
            System.out.println("[]");
        }
    }
}
