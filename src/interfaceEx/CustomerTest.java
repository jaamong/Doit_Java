package interfaceEx;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();

        Buy buyer = customer; //customer 할당
        buyer.buy();

        Sell seller = customer; //customer 할당
        seller.sell();

        customer.order();
        buyer.order(); //virtual method -> 오버라이딩된 메서드 호출
        seller.order(); //virtual method -> 오버라이딩된 메서드 호출
    }
}
