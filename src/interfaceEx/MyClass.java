package interfaceEx;

public class MyClass implements MyInterface {

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        X xClass = myClass;
        xClass.x();
    }
}
