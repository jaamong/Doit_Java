package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(10001, "fir");
        customer1.calPrice(10000);
        System.out.println(customer1.showCustomerInfo());

        VIPCustomer customer2 = new VIPCustomer(10002, "sed", 100);
        customer2.calPrice(10000);
        System.out.println(customer2.showCustomerInfo());

        Customer customerWho = new VIPCustomer(1010001, "Who", 101);
        int price = customerWho.calPrice(10000);
        System.out.println("지불 금액 : " + price + ", " + customerWho.showCustomerInfo());


    }
}
