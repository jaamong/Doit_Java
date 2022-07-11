package array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] numbers = new int[10]; //40 bytes
        int[] numbers2 = new int[] {0, 1, 2}; //선언과 동시에 초기화, 초기화되는 데이터만큼 메모리 잡힘

        System.out.println(numbers.length);
        System.out.println(numbers2.length);

        numbers[0] = 1; //선언만 한 경우 하나씩 넣는다

        int[] students = new int[5];
        for(int i=0; i<students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
