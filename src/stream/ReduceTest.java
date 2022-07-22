package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) { //BinaryOperator의 구현부
        if (s1.getBytes().length <= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요", "hello", "Good morning", "반갑습니다."};

        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
                    if (s1.getBytes().length >= s2.getBytes().length) return s1;
                    else return s2; //여기까지 람다식
                }) //여기까지 구현부
        );

        System.out.println();

        //BinaryOperator의 구현부를 쓸 때는 초기값을 쓰지 않는다.
        String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //reduce(new CompareString()) : apply 호출
        System.out.println(str);
    }
}
