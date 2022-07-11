package arraylist;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Subject> subjectList; //여러 과목 수강

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject subject : subjectList) {
            total += subject.getScore();
            System.out.println("학생 " + name + "의 " +
                    subject.getName() + "의 성적은 " + subject.getScore() + "입니다.");
        }
        System.out.println(name + "의 총점 : " + total);
    }
}
