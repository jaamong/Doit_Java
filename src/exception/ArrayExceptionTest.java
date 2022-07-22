package exception;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= 5; i++) { //Runtime Exception 발생 : ArrayIndexOutOfBoundsException
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e); //exception의 toString
            return; //finally 구문 이후 수행됨
        } finally { //try 수행 후 무조건 수행되는 block (exception 발생 여부 노상관)
            System.out.println("finally");
        }
        //catch에서 return; 해서 end 안찍힘
        //return없으면 찍힘
        System.out.println("end");
    }
}
