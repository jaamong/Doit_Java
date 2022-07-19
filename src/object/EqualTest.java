package object;

class Student {
    int studentID;
    String studentName;

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    //equals() 재정의
    @Override
    public boolean equals(Object obj) { //Object 타입으로 업캐스팅되서 들어옴
        if (obj instanceof Student) { //다운캐스팅을 위한 확인
            Student std = (Student) obj; //다운 캐스팅
            if (this.studentID == std.studentID)
                return true;
            else
                return false;
        }
        return false;
    }

    public int hashCode() {
        return studentID;
    }
}

public class EqualTest {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test"); //str1과 힙 메모리 주소가 다름름

        System.out.println(str1 == str2); //물리적인 값(메모리 주소값) 비교
        System.out.println(str1.equals(str2)); //문자열이 같은지 (논리적인 값)


        Student std1 = new Student(10001, "호진");
        Student std2 = new Student(10001, "호진");

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2)); //재정의 전 false : equals()의 원형은 == 임. 이때는 재정의를 하자

        System.out.println(std1.hashCode()); //힙에 저장된 주소 반환
        System.out.println(std2.hashCode()); //hasCode() 재정의 : 두 학생이 같은 경우, 같은 studentID 반환

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode()); //str1과 str2는 생성을 달리 했기 때문에 분명히 힙 주소값이 다를 것이다.
                                             // 하지만 동일한 해시코드 값이 출력됨. 오버라이딩 되어있기 때문.

        System.out.println(System.identityHashCode(str1)); //이미 해시코드가 재정의되어있는 경우 실제 해시코드값을 알고 싶을 때
        System.out.println(System.identityHashCode(str2));
    }
}