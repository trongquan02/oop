package homework6.mytime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%1$02d:%2$02d:%3$02d", hour, minute, second);
    }
    public MyTime nextSecond() {
        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
            return this;
        }
        if (minute == 59 && second == 59) {
            minute = 0;
            second = 0;
            hour++;
            return this;
        }
        if (second == 59) {
            second = 0;
            minute++;
            return this;
        }
        second++;
        return this;
    }
    public MyTime nextMinute() {
        if (hour == 23 && minute == 59) {
            hour = 0;
            minute = 0;
            return this;
        }

        if (minute == 59) {
            hour++;
            minute = 0;
            return this;
        }
        minute++;
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23) {
            hour = 0;
            return this;
        }
        hour++;
        return this;
    }
    public MyTime previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return this;
        }
        if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
            return this;
        }
        if (second == 0) {
            minute--;
            second = 59;
            return this;
        }
        second--;
        return this;
    }

    public MyTime previousMinute() {
        if (hour == 0 && minute == 0) {
            hour = 23;
            minute = 59;
            return this;
        }
        if (minute == 0) {
            hour--;
            minute = 59;
            return this;
        }
        minute--;
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            hour = 23;
            return this;
        }
        hour--;
        return this;
    }


}

