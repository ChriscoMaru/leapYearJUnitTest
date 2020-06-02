package leapYear;

public class leapYear{


    public static boolean multipleFour(int year){
        if (year%4==0){
            return true;
        }else{
            return false;
        }

    }

    public static boolean multipleFourhundred(int year){
        if (year%400==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean multipleOnehundred(int year){
        if (year%100==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isLeapYear(int year){
        if (multipleFour(year)){
            if (multipleOnehundred(year)){
                if (multipleFourhundred(year)){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }

        } else {
            return false;
        }
    }

}