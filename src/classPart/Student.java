package classPart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    //public Student() {} //default constructor : 자바 컴파일러가 생성해줌
    //default constructor : 인스턴스 변수(필드 값 등)를 초기화 시키는 역할

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    /*
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "나";
        student1.address = "여기";

        student1.showStudentInfo();
    }*/
}
