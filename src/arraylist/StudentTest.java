package arraylist;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "D");
        student1.addSubject("korea", 100);
        student1.addSubject("eng", 90);
        student1.showStudentInfo();

        System.out.println("----------------------------------------");

        Student student2 = new Student(1002, "J");
        student2.addSubject("korea", 80);
        student2.addSubject("eng", 100);
        student2.addSubject("math", 100);
        student2.showStudentInfo();
    }
}
