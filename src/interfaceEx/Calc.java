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

    default void description() { //default method
        System.out.println("정수 계산기를 구현한다.");
    }

    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        return total;
    }
}
