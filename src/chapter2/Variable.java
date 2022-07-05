package chapter2;

public class Variable {
    public static void main(String[] args) {
        byte bData = -128;
        System.out.println(bData);

        byte bData2 = 127;
        System.out.println(bData2);

        //정수는 기본적으로 4바이트로 저장이 된다. 아래 정수에 L(식별자)을 붙이지 않으면 4바이트로는 아래의 정수가 담기지 않는다
        long num = 12345667789L; // L : 8바이트로 저장해라 라고 컴파일러에게 알려주기

        double dNum = 3.14;
        float fNum = 3.14F; //F : float로 저장해라!


    }
}
