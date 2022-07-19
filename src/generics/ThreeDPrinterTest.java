package generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {

        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial(); //getMaterial() : return Object type
        System.out.println(printer);

        ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic = printerPlastic.getMaterial();
        System.out.println(printerPlastic);

        /*
        ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>(); //Material을 상속받지 않아서 빨간줄
        printerWater.setMaterial(new Water());
        System.out.println(printerWater);
         */

        printerPlastic.printing();
    }
}
