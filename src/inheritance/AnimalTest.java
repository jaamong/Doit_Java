package inheritance;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직인다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷는다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽는다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뛴다");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 한다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 난다.");
    }

    public void flying() {
        System.out.println("하늘을 날아간다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human()); // == Animal animal = new Human();
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

    }

    public void moveAnimal(Animal animal) {
        animal.move(); //polymorphism

        /*
        Human human = (Human)animal; //컴파일은 됨
        human.readBook();
         */

        //if문으로 체크하고 다운캐스팅을 하자
        if(animal instanceof Human) {
            Human human = (Human)animal;
            human.readBook();
        } else if (animal instanceof Tiger) {
            Tiger tiger = (Tiger)animal;
            tiger.hunting();
        } else if(animal instanceof Eagle) {
            Eagle eagle = (Eagle)animal;
            eagle.flying();
        } else {
            System.out.println("지원되지 않는 기능입니다.");
        }
    }
}
