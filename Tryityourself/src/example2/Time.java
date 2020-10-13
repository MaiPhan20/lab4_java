package example2;

public class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(int hourTime,int minuteTime,int secondTime){
        hour=hourTime;
        minute=minuteTime;
        second=secondTime;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public int nextSecond(){
        return second +1;
    }
    public int previousSecond(){
        return second-1;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hh:" + hour +
                ", mm:" + minute +
                "ss" + second +
                '}';
    }
}
