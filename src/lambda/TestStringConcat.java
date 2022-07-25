package lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        //객체지향 프로그래밍 방식
        StringConcatImpl stringConcatImpl = new StringConcatImpl();
        stringConcatImpl.makeString("hello", "java");

        //람다식을 이용한 방식
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("java", "hello");

        //람다식을 사용했을 때 내부에서 일어나는 일(익명클래스)
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }};

        concat2.makeString("엥", "엥엥");
    }
}
