package com.pan.enumdemo;

/**
 * 普通java类实现枚举类
 * @author pan
 * @date 2018-05-09 15:35:37
 */
public abstract class WeekDay {
    private WeekDay(){

    }
    public final static WeekDay MON = new WeekDay(){

        public WeekDay nextDay() {
            return TUE;
        }
    };
    public final static WeekDay TUE = new WeekDay(){

        public WeekDay nextDay() {
            return WED;
        }
    };
    public final static WeekDay WED = new WeekDay() {
        public WeekDay nextDay() {
            return THU;
        }
    };
    public final static WeekDay THU = new WeekDay() {
        public WeekDay nextDay() {
            return FRI;
        }
    };
    public final static WeekDay FRI = new WeekDay() {
        public WeekDay nextDay() {
            return SAT;
        }
    };
    public final static WeekDay SAT = new WeekDay() {
        public WeekDay nextDay() {
            return SUN;
        }
    };
    public final static WeekDay SUN = new WeekDay() {
        public WeekDay nextDay() {
            return MON;
        }
    };

    /**
     * 这里采用了抽象方法定义nextDay()就将大量的if else语句转移成了一个个独立的类
     * @return
     */
    public abstract WeekDay nextDay();

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
