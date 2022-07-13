package template;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전한다.");
        System.out.println("사람이 핸들을 조작한다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 크레이크로 정지한다.");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 수동으로 와이퍼를 조작한다.");
    }
}
