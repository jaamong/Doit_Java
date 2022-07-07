package thisEx;

class Person{
    String name;
    int age;

    public Person() {
        //생성자 안에서 다른 생성자를 호출하는 this를 사용할 때는 this가 가장 먼저 나오는 statement여야만 한다.
        this("이름없음", 1); //call another constructor
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        return this; //현재 instance의 주소값을 나타낸다.
    }
}

public class CallAnotherConstructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);

        System.out.println(p1.returnSelf());
    }
}
