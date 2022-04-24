public class Clock {

    int currentTime = 2300;

    public void displayPartOfDay() {
        if (currentTime >= 800 && currentTime < 1200) {
            System.out.println("MORNING");
        } else if (currentTime >= 1200 && currentTime < 1700) {
            System.out.println("AFTERNOON");
        } else if (currentTime >= 1700 && currentTime < 2400) {
            System.out.println("AFTERNOON");
        } else if (currentTime >= 0 && currentTime < 800) {
            System.out.println("EARLY MORNING");
        }
    }

}
