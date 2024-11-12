package task3;

public class Date {
    int day;
    int month;
    int year;

    Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    int getDay(){
        return day;
    }

    void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    int getMonth() {
        return month;
    }

    void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            this.year = 1;
        }
    }

    void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
