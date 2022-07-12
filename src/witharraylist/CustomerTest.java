package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customer1 = new Customer(10001, "엥");
        Customer customer2 = new Customer(10010, "엥엥");
        GoldCustomer customer3 = new GoldCustomer(10011, "엥엥엥");
        GoldCustomer customer4 = new GoldCustomer(10100, "엥엥엥엥");
        VIPCustomer customer5 = new VIPCustomer(10101, "엥엥엥엥엥", 100);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        System.out.println("============ 고객정보 출력 ============");
        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("============ 할인율과 보너스 포인트 결과 ============");
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calPrice(price);
            System.out.println(customer.getCustomerID() + "님이 " +cost + "를 지불하셨습니다.");
            System.out.println(customer.showCustomerInfo());
        }
    }
}
