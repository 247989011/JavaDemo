package com.pan.enumdemo;

/**
 * 普通java类实现枚举类
 * @author pan
 * @date 2018-05-09 15:35:37
 */
public abstract class WeekDay1 {
    private WeekDay1(){

    }
    public final static WeekDay1 MON = new WeekDay1(){

        public WeekDay1 nextDay() {
            return TUE;
        }
    };
    public final static WeekDay1 TUE = new WeekDay1(){

        public WeekDay1 nextDay() {
            return WED;
        }
    };
    public final static WeekDay1 WED = new WeekDay1() {
        public WeekDay1 nextDay() {
            return THU;
        }
    };
    public final static WeekDay1 THU = new WeekDay1() {
        public WeekDay1 nextDay() {
            return FRI;
        }
    };
    public final static WeekDay1 FRI = new WeekDay1() {
        public WeekDay1 nextDay() {
            return SAT;
        }
    };
    public final static WeekDay1 SAT = new WeekDay1() {
        public WeekDay1 nextDay() {
            return SUN;
        }
    };
    public final static WeekDay1 SUN = new WeekDay1() {
        public WeekDay1 nextDay() {
            return MON;
        }
    };

    /**
     * 这里采用了抽象方法定义nextDay()就将大量的if else语句转移成了一个个独立的类
     * @return
     */
    public abstract WeekDay1 nextDay();

    /*public WeekDay nextDay(){
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
*/

    @Override
    public String toString() {
        String out = null;
        if(this == SUN){
            out = "SUN";
        }else if (this == MON){
            out = "MON";
        }else if (this == TUE){
            out = "TUE";
        }else if (this == WED){
            out = "WED";
        }else if (this == THU){
            out = "THU";
        }else if (this == FRI){
            out = "FRI";
        }else if (this == SAT){
            out = "SAT";
        }
        return out;
    }
}
