package collaboration;

public class Bus {
    int number;
    int passengerCount;
    int money;

    public Bus(int number) {
        this.number = number;
    }

    public void take(int money) { //승객 한 명을 태우는 메소드
        passengerCount++; //승객 수 증가
        this.money += money; //받은 돈 만큼 추가
    }

    public void showInfo() {
        System.out.println("버스 " + number + " 번의 승객 수 " + passengerCount +
                ", 수입 : " + money);

    }
}
