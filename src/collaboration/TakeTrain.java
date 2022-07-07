package collaboration;

public class TakeTrain {
    public static void main(String[] args) {
        Student student1 = new Student("데연", 5000);
        Student student2 = new Student("종제", 10000);

        Bus bus = new Bus(100);
        student1.takeBus(bus);
        student1.showInfo();
        bus.showInfo();

        Subway subway = new Subway(2);
        student2.takeSubway(subway);
        student2.showInfo();
        subway.showInfo();
    }
}
