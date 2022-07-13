package interfaceEx;

public class ComplateCalc extends Calculator { //구현 상속

    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {

        if (num2 != 0) {
            return num1 / num2;
        }
        return ERROR;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현했다.");
    }
}
