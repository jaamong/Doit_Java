package abstractEx;

public class ComputerTest {
    public static void main(String[] args) {

//        Computer c1 = new Computer(); //추상 클래스는 new 될 수 없다. 추상 메서드에 구현부가 없기 때문에 실행할 수 있는 명령이 없기 때문/
        Computer c2 = new Desktop(); //상위클래스의 추상클래스를 다 구현했으므로 new가능
//        Computer c3 = new Notebook();
        Computer c4 = new MyNotebook();
        Notebook c5 = new MyNotebook();

        c2.display(); //Desktop 클래스에 구현된 display가 호출됨(오버라이딩)
        c4.display(); //Notebook 클래스에 구현된 display가 호출됨(오버라이딩)
    }
}
