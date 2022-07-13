package interfaceEx;

/*
interface에는 상수와 추상 메서드가 선언된다.
 */
public interface Calc {

    //public static final
    double PI = 3.14;
    int ERROR = -999999999;

    //public abstract method
    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);
}
