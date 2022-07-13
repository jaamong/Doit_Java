package template;

public abstract class Car {

    //차가 달리거나 멈추는 것은 어떤 차인지에 따라 결정된다.
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void washCar() {} //필요에 의해서 재정의를 해서 쓰는 것

    public void startCar() {
        System.out.println("시동을 켠다.");
    }

    public void turnOff() {
        System.out.println("시동을 끈다.");
    }

    public final void run() {
        // 메소드를 final로 선언하면 재정의가 불가능하다 : template method
        // 시나리오는 변할 수 없다! -> final로 선언하자
        startCar();
        drive();
        wiper();
        stop();
        washCar(); //필요없으면 굳이 재정의를 안해도 되고, 필요하면 재정의 한다
        turnOff();
    }
}
