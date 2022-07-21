package lambda;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {

        //변수에 대입해서 바로 구현하는 방법
        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("test");

        //구현부가 매개변수로 넘어가는 방법
        showMyString(lambdaPrint);

        //구현부를 반환값으로 넘기는 방법
        PrintString reStr = returnPrint();
        reStr.showString("hello");
    }

    //메인이 static이라서 사용하려면 static으로 선언해야 함
    public static void showMyString(PrintString lambda) {
        lambda.showString("test2");
    }

    public static PrintString returnPrint() {
        return s -> System.out.println(s + " world"); //매개변수 s
    }
}
