package template;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행한다.");
        System.out.println("자동차가 스스로 방향을 전환한다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 스스로 멈춘다.");
    }

    @Override
    public void wiper() {
        System.out.println("비나 눈의 양에 따라 자동으로 조절한다.");
    }

    @Override
    public void washCar() {
        System.out.println("자동으로 세차한다.");
    }
}
