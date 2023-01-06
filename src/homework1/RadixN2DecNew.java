package homework1;
import java.util.Scanner;
public class RadixN2DecNew {
    public static boolean isValiRadixString(String radixString, int index) {
        radixString = radixString.toLowerCase();
        for (int i = 0; i < radixString.length(); i++) {
            if ((Character.digit(radixString.charAt(i),index)) > 0) {
                continue;
            }
            return false;
        }
        return true;
    }
    public static int toRadixDigit(char ch, int n) {
        return Character.digit(ch, n);
    }
    public static int convebtRadix2Dec(String radixString, int index) {
        if (isValiRadixString(radixString, index) == true) {
            int decimalValue = 0;
            for (int i = 0; i < radixString.length(); i++) {
                decimalValue = index * decimalValue + toRadixDigit(radixString.charAt(i), index);
            }
            return decimalValue;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap String: ");
        String radixString = sc.nextLine();
        System.out.println("Nhap Index: ");
        int index = sc.nextInt();
        System.out.println("ket qua: " + convebtRadix2Dec(radixString,index));
    }
}
