package randomlogicproblems;

public class LeapYear {

    private boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 || year % 100 == 0;

    }

    public static void main(String[] args) {
        int year = 1700;
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.isLeapYear(year));

    }
}
