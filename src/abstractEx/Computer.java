package abstractEx;

public abstract class Computer { //abstract method를 가지기 위해서는 추상 클래스가 되어야 한다.

    /*
    추상클래스를 왜 만들까?
        - 상속을 하기 위해서
        - 하위클래스(상속받은 클래스)에서 구현한다.
    추상클래스는 인스턴스화될 수 없다(new 못함)

    Computer <- Desktop : Computer(상위 클래스)는 Desktop(하위 클래스)에 구현을 위임시켰다.
     */

    public abstract void display(); //구현은 안하고 선언만 하겠다.
    public abstract void typing(); //이렇게 body가 없으면 추상 메서드(abstract method)라고 한다.

    public void turnOn() {
        System.out.println("전원을 킨다.");
    }

    public void turnOff() {
        System.out.println("전원을 끈다");
    }
}
