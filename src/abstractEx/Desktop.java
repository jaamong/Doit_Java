package abstractEx;

public class Desktop extends Computer {
    // 문법적으로 모든 추상메서드가 구현되어있지만 Desktop 클래스도 abstract 클래스가 될 수 있다
    // 이 경우 당연히 new 불가능
    // 상속용으로 쓰기 위한 경우

    /*
    추상 클래스를 상속받음
        - 하위클래스도 추상클래스가 되거나
        - 아니면 상위클래스의 모든 추상 메서드를 구현하거나
    => Desktop 클래스는 Computer 클래스의 추상 메서드들에 대한 구현의 책임이 있다.
     */

    @Override
    public void display() {
        System.out.println("Desktop display()");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing()");
    }

    public void turnOn() {
        System.out.println("Desktop turnOn()");
    }
}
