package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
//        Customer customer1 = new Customer(10100, "me");

        VIPCustomer customer2 = new VIPCustomer(10101, "meme");

        //상위 클래스로의 묵시적 형 변환(업캐스팅)
        //타입은 Customer, 생성은 VIPCustomer -> 생성자는 VIPCustomer가 불렸으므로 메모리는 하위 클래스만 생성
        //하지만 customerTest의 타입이 Customer이므로 Customer 클래스의 멤버 변수, 메서드만 사용가능
        Customer customerTest = new VIPCustomer(10000,"ma");

//        System.out.println(customer1.showCustomerInfo());
        System.out.println(customer2.showCustomerInfo());
    }
}
