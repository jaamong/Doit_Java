package staticEx;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        //목표 : new할 때마다 studentID가 1씩 증가했으면 좋겠어! -> static 변수
        //1. static 변수인 serialNum 선언

        /*
        student2.serialNum++; //10001

        System.out.println(student1.serialNum); //10001
        System.out.println(student2.serialNum); //10001 -> 즉 두 instance가 serialNum(static variable)을 공유함을 알 수 있음
         */

        //2. 생성자를 이용하여 공유하는 static 변수를 1씩 증가시키고 그 값을 id에 할당
        System.out.println(student1.studentID); //instance가 생성된 후의 ID값 : 10001
        System.out.println(student2.studentID); // 10002

        System.out.println(student1.serialNum); //두 instance가 공유하는 static 변수 값 : 10002
        System.out.println(student2.serialNum); //10002

        // static 변수는 class 이름으로 참조하자!!!
        System.out.println(Student.getSerialNum()); //private 변수라서 getter를 이용하여 가져오기
    }
}
