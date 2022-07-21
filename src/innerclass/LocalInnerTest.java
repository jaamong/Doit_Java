package innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    Runnable runnable = new Runnable() { //익명 이너클래스 (anonymous class)
        //클래스이름 참조변수이름 = new 클래스이름() { 메소드 선언 };
        //단 하나의 추상클래스 또는 인터페이스만을 구현
        @Override
        public void run() {
            System.out.println("runnable");
        }
    };

    //Runnable : 쓰레드 사용할 때 인터페이스
    public Runnable getRunnable(final int i) {
        //이 메소드가 호출된다는 의미는 Outer 클래스가 생성이 되었다는 뜻 -> outNum, (sNum, static이라서 그 전에 생성되었을 것)도 생성되었다는 뜻

        final int localNum = 100; //이 메소드가 호출될 때 이 변수도 생성이 된다(지역변수) //상수화 됨
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
                System.out.println(i);
            }};
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
//        outer.getRunnable(20).run();
        Runnable runnable = outer.getRunnable(20);
        runnable.run();

        outer.runnable.run();
    }
}
