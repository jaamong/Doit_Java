package inheritance;

public class Circle {

    //Point class가 x, y를 갖고 있지만 원(Circle)과 점(Point)은 상속관계가 아님
    //상속처럼 일반적이고 구체적인 관계(is-a 관계)가 아닌, Circle class에서 Point의 점(x, y)를 활용하고 싶은 것
    //이럴 때는 상속이 아니다 -> 합성(has-a 관계)

    Point point; //합성
    private int radius;

    public Circle() {
        point = new Point();
    }
}
