package com.fanyang.java.enumtest;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-04 19:15
 */
public interface AggregationEnum {

    enum Week1 {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), WEEKDAY(7);
        private int day;

        Week1(int day) {
            this.day = day;
        }
        Week1() {
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }
    enum Month{
        JAN,FEB,MAR,APR;
    }
}

class TestWeek1 {
    public static void main(String[] args) {
        AggregationEnum.Week1 week1 = AggregationEnum.Week1.MONDAY;
        AggregationEnum.Month month = AggregationEnum.Month.JAN;
        System.out.println(week1.toString());
        System.out.println(week1.getDay());
        System.out.println(month.toString());
    }

}

