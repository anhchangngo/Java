public class LeapYear {
    public static void main(String[] args){
        int year = Integer.parseInt(args[0]);
        boolean is_leapyear;
        is_leapyear = (year % 4 == 0) || (year % 400 == 0);
        System.out.println(is_leapyear);
    }
}

// Use : java LeapYear 2020
// Out put : true