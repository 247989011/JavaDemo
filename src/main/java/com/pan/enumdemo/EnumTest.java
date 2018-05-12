package com.pan.enumdemo;

public class EnumTest {

    public static void main(String[] args){
        WeekDay1 weekDay1 = WeekDay1.MON;
        System.out.println(weekDay1.nextDay());

        WeekDay weekDay = WeekDay.FRI;
        System.out.println(weekDay);
        System.out.println(weekDay.name());
        System.out.println(weekDay.ordinal());//ordinal()方法返回一个int值，是每个enum实例在声明时的次序,从0开始.
        System.out.println(weekDay.getDeclaringClass());
        System.out.println(weekDay.getClass());
        System.out.println(WeekDay.valueOf("SUN"));
        System.out.println(WeekDay.values().length);//枚举实例数组
    }

    public enum WeekDay{
        SUN,MON,TUE,WED,THU,FRI,SAT;

    }
}
