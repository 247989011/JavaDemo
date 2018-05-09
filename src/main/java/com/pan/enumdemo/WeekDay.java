package com.pan.enumdemo;

/**
 * 普通java类实现枚举类
 * @author pan
 * @date 2018-05-09 15:35:37
 */
public class WeekDay {
    private WeekDay(){

    }
    public final static WeekDay MON = new WeekDay();
    public final static WeekDay TUE = new WeekDay();
    public final static WeekDay WED = new WeekDay();
    public final static WeekDay THU = new WeekDay();
    public final static WeekDay FRI = new WeekDay();
    public final static WeekDay SAT = new WeekDay();
    public final static WeekDay SUN = new WeekDay();

    public WeekDay nextDay(){
        if (this == SUN){
            return MON;
        }else if (this == MON){
            return TUE;
        }else if (this == TUE){
            return WED;
        }else if (this == WED){
            return THU;
        }else if (this == THU){
            return FRI;
        }else if (this == FRI){
            return SAT;
        }else if (this == SAT){
            return SUN;
        }
        return null;
    }

}
