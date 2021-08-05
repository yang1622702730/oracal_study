package com.fanyang.java.enumtest;

public enum Week implements TodayIs{
    MONDAY(1){
//        @Override
//        public String toString() {
//            System.out.println(MONDAY.day);
//            return null;
//        }

        @Override
        public void show() {
            System.out.println("今天是星期一");
        }
    },TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),WEEKDAY(7);
    private int day;
    Week(int day) {
        this.day = day;
    }
    Week(){}

    @Override
    public void show() {
        System.out.println("今天是星期几呢，不知道");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
class TestWeek{
    public static void main(String[] args) {
        Week week1 = Week.MONDAY;
        week1.show();
        System.out.println(week1.toString());
        System.out.println(week1.getDay());
    }

}
interface TodayIs{
    void show();
}
