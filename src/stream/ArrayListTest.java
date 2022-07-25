package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>(); //List : ArrayList의 상위 인터페이스
        sList.add("엥1");
        sList.add("엥2");
        sList.add("엥3");

        Stream<String> stream = sList.stream(); //stream 생성. generic 타입. -> List<String>이므로 Stream<String>으로
        stream.forEach(s -> System.out.println(s)); //stream.forEach(람다식)

        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.println(s));
        //sorted() : 중간연산자, forEach() : 최종연산자
    }
}
