package task3;

public class SettedDate {
    public static void main(String[] args){

        Date today = new Date(0, 14, 0);

        System.out.println();
        today.displayDate();

        today.setDay(13);
        today.setMonth(11);
        today.setYear(2024);

        System.out.println();
        today.displayDate();
    }
}
