public class WorkSchedule {
    public static void main(String[] args) {
        int day = 3;   //3rd day of the week...
        boolean holiday = true;
        if (holiday)
            System.out.println("hoilidayy");
        else if (day == 6 || day == 7)
            System.out.println("weekend");
        else System.out.println("work");

        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";
    }

}
