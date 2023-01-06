package lab1;

public class PrintDayInWord {
    public static void main(String[] args) {
        int number = 5;
        if (number == 0) {
            System.out.println("SUNDAY");
        }else if (number == 1) {
            System.out.println("MONDAY");
        }else if (number == 2) {
            System.out.println("TUESDAY");
        }
        else if (number == 3) {
            System.out.println("WEDNESDAY");
        }
        else if (number == 4) {
            System.out.println("THURSDAY");
        }
        else if (number == 5) {
            System.out.println("FRIDAY");
        }
        else if (number == 6) {
            System.out.println("SATURDAY");
        }else {
            System.out.println("Not a valid day");
        }
    

// Using switch-case-default
        switch (number) {
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;                        
            default:
                System.out.println("Not a valid day");
                break;
        }
    
    }

    
}
