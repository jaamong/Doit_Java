package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr).sum(); //스트림 생성 : Arrays.stream(arr) //intStream 반환
        System.out.println(sum);

        IntStream stream = Arrays.stream(arr);

        int sum2 = stream.sum(); //한번 사용된 stream은 다 소모가 됨
        System.out.println(sum2);
//        int count = (int)stream.count(); //에러 : 한번 사용한 stream은 재사용 불가능
//        System.out.println(count);                //stream을 다시 생성해야 함

    }
}
