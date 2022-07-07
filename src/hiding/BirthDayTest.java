package hiding;

class BirthDay {
    int day;
    int month;
    int year;
}

public class BirthDayTest{
    public static void main(String[] args) {
        BirthDay day = new BirthDay();
        day.month = 2;
        day.year = 2018;
        day.day = 30;
    }
}
