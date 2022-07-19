package string;

public class StringBuilderTest {
    public static void main(String[] args) {

        String str1 = new String("java");
        System.out.println(System.identityHashCode(str1));

        StringBuilder buffer = new StringBuilder(str1);
        System.out.println(System.identityHashCode(str1));

        buffer.append(" and");
        buffer.append(" android");
        System.out.println(System.identityHashCode(str1));

        String str2 = buffer.toString();
        System.out.println(str2);


        Integer i = 100; //java9 이후 new로 생성안해도 됨
    }
}
