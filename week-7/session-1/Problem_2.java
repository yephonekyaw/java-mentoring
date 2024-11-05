import java.util.Scanner;

class Time {
  private long hour;
  private long minute;
  private long second;

  public Time() {
    this(0, 0, 0);
  }

  public Time(long elapseTime) {
    long totalSeconds = elapseTime / 1000;
    this.second = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    this.minute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    this.hour = totalHours % 24;
  }

  public Time(long hour, long minute, long second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public long getHour() {
    return this.hour;
  }

  public long getMinute() {
    return this.minute;
  }

  public long getSecond() {
    return this.second;
  }

  public void setTime(long elapseTime) {
    long totalSeconds = elapseTime / 1000;
    this.second = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    this.minute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    this.hour = totalHours % 24;
  }
}

public class Problem_2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long elapseTime = scan.nextLong();


    long totalSeconds = elapseTime / 1000;
    long second = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    long minute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long hour = totalHours % 24;

    Time t = new Time(hour, minute, second);
    System.out.println(t.getHour() + ":" + t.getMinute() + ":" + t.getSecond());
  }
}
