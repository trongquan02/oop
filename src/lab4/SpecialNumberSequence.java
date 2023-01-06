package lab4;

public class SpecialNumberSequence {
    public static void main(String[] args) {
        String str = "";
        int number = 12;
        System.out.printf("S(" + number + ") = ");
        System.out.println(len(number, str));
    }

    public static int len(int number, String str) {
        if (number == 0) {
            System.out.print(str + " Length is ");
            return str.length();
        }
        str = number + str;
        return len(number - 1, str);
    }
}
