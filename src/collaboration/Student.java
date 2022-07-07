package collaboration;

public class Student {
    String name;
    int grade;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000); //객체 간의 협력
        money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1000); //객체 간의 협력
        money -= 1000;
    }

    public void showInfo() {
        System.out.println(name + "님의 잔액 : " + money);
    }
}
