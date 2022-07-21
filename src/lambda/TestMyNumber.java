package lambda;

public class TestMyNumber {
    public static void main(String[] args) {

        MyNumber maxNum = (x, y) -> (x >= y) ? x : y; //람다식, getMaxNumber 구현부
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println(max);

        //자바는 객체지향프로그래밍이기 때문에 객체 없이는 메소드 호출이 불가능
        //람다식으로 메서드를 구현하고 호출하면 내부에서 아래와 같이 익명클래스(anonymous class)가 생성된다.
        int i = 100; //람다식에서 외부 메서드의 지역변수는 상수(final)로 처리된다.
        MyNumber aaa = new MyNumber() {
            @Override
            public int getMaxNumber(int n1, int n2) {
//                i = 200;
                System.out.println(i); //참조만 가능
                return 0;
        }};
    }
}
