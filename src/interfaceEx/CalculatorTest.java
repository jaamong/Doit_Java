package interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new ComplateCalc();
        //Calc 타입에 종속되었기 때문에 CompleteCalc의 showInfo() 호출 불가능
        //호출하고 싶다면 down casting

        System.out.println(calc.add(num1, num2));

        calc.description();

        int[] arr = {1,2,3,4};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
