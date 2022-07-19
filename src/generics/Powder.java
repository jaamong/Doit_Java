package generics;

public class Powder extends Material{
    @Override
    public String toString() {
        return "재료 : Powder";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder로 출력중");
    }
}
