package innerclass;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();

    }

    //인스턴스 클래스에서는 static 변수, 메서드 선언이 불가능 하다.
    private class InClass {
        int inNum = 200;
//        static sInNUM = 100; //static 변수와 메서드 인스턴스 생성과 상관없이 호출가능, 따라서 인스턴스 클래스에서는 선언 불가능

        void inTest() {
            System.out.println(num);
            System.out.println(sNum); //이미 선언되어있는 static 변수를 사용하는 건 가능
        }

        /*
        static void sTest() {

        } */
    }

    public void usingInTest() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            //num += 10; //사용 불가능
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() { //정적 클래스 안에 있는 정적 메소드 : 클래스 생성과 상관없이 해당 메소드는 호출 가능
            System.out.println(sNum);
//            System.out.println(iNum); //따라서 사용 불가능
            System.out.println(sInNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {

        /*
        OutClass outClass = new OutClass();
        outClass.inClass.inTest();

        OutClass.InClass inClass = outClass.new InClass();
        inClass.inTest();
         */

        OutClass outClass = new OutClass();
        outClass.usingInTest();

//        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        OutClass.InStaticClass.sTest(); //정적 클래스 안에 있는 정적 메소드 : 어떤 생성과도 상관없이 호출 가능
    }
}
