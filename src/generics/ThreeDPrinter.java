package generics;

public class ThreeDPrinter<T extends Material> {
    //T는 컴파일러가 Object로 캐스팅해준다.
    //<T extends Material> : Material 클래스를 상속받은 애들만 쓸 수 있다.

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ThreeDPrinter{" +
                "material=" + material +
                '}';
    }

    public void printing() {
        material.doPrinting();
    }
}
