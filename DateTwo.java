public class DateTwo {

    private int dayNumber = 5;

    public void displayDay() {
        if (dayNumber == 1) {
            System.out.println("MONDAY");
        } else if (dayNumber == 2) {
            System.out.println("TUESDAY");
        } else if (dayNumber == 3) {
            System.out.println("WEEDNESDAY");
        } else if (dayNumber == 4) {
            System.out.println("THURSDAY");
        } else if (dayNumber == 5) {
            System.out.println("FRIDAY");
        } else if (dayNumber == 6) {
            System.out.println("SATURDAY");
        } else if (dayNumber == 7) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("DAY NOT FOUND");
        }
    }

}
