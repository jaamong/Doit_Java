package staticEx;

public class Student {
    static int serialNum = 10000;

    int studentID;
    String studentName;

    public Student() {
        //instance가 생성될 때 생성자(constructor)가 호출됨 -> 이 점을 이용하여 studentID를 1씩 증가시키자

        serialNum++; //static 변수이므로 모든 instance가 공유
        studentID = serialNum; //증가시킨 serialNum을 생성된 instance의 ID에 할당
    }

    //static method에서는 instance 변수를 쓸 수 없다.
    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
