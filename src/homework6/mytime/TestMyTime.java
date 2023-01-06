package homework6.mytime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(1, 5, 25);
        System.out.println(time);
        time.setTime(12, 35, 9);
        System.out.println(time);

        time.setHour(23);
        time.setMinute(58);
        time.setSecond(59);
        System.out.println(time);

        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        System.out.println(time.nextSecond());
        System.out.println(time.nextMinute());
        System.out.println(time.nextHour());

        System.out.println(time.previousSecond());
        System.out.println(time.previousMinute());
        System.out.println(time.previousHour());
    }
}
