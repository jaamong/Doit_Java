package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerID(10100);
        customer1.setCustomerName("me");

        VIPCustomer customer2 = new VIPCustomer();
        customer2.setCustomerID(10101);
        customer2.setCustomerName("meme");

        System.out.println(customer1.showCustomerInfo());
        System.out.println(customer2.showCustomerInfo());
    }
}
