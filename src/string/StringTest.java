package string;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); //같은 주소 인지 확인
        //new로 생성된 두 개의 인스턴스 값은 다름

        String str3 = "abc"; //문자열 상수를 직접 가리키게 됨
        String str4 = "abc";
        System.out.println(str3 == str4); //동일한 메모리


        String str5 = new String("java");
        String str6 = new String("android");
        System.out.println(System.identityHashCode(str5)); //"java"를 가리킴

        str5 =  str5.concat(str6);
        System.out.println(str5);
        System.out.println(System.identityHashCode(str5)); //"javaandroid"를 가리킴
    }
}
