public class Time {
    private int hours;
    private int minutes;
    private int seconds;



    public Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public String addTime (Time t1) {
        return "";
    }

    public int tick() {
        if (seconds < 60) {
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }
        }
        else if (minutes < 60) {
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
        }
        else if (hours < 60) {
            hours++;
            if (hours == 24) {
                hours = 0;
                minutes = 0;
                seconds = 0;
            }
        }
        return hours;
    }
}


