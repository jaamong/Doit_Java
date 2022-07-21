package innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    //Runnable : 쓰레드 사용할 때 인터페이스
    public Runnable getRunnable(final int i) {
        //이 메소드가 호출된다는 의미는 Outer 클래스가 생성이 되었다는 뜻 -> outNum, (sNum, static이라서 그 전에 생성되었을 것)도 생성되었다는 뜻

        final int localNum = 100; //이 메소드가 호출될 때 이 변수도 생성이 된다(지역변수)
        class MyRunnable implements Runnable { //지역 내부 클래스
            //getRunnable 메서드가 호출되면서 클래스 생성됨

            @Override
            public void run() {
//                localNum += 100; //값을 변경시키고 있음(변수의 유효성)
//                i += 10; //위와 동일
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }
        return new MyRunnable(); //클래스 반환
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
//        outer.getRunnable(20).run();
        Runnable runnable = outer.getRunnable(20);
        runnable.run();
    }
}
