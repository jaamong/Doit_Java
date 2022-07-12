package inheritance;

public class VIPCustomer extends Customer { //Customer 상속받음
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {

        //precompile 때 하위 클래스에서 super();를 이용하여 상위 클래스의 default constructor를 호출
        //default constructor가 아닌 인자가 있는 생성자인 경우 super를 명시적으로 호출하고 그 안에 인자를 넣어준다.
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;

        System.out.println("VIPCustomer(int, String) 호출");
    }

    public int calPrice(int price) { //overriding : 상위 클래스 메서드와 똑같은 이름, 똑같은 매개변수의 메서드를 재정의
        bonusPoint += price * bonusRatio; //일반 고객과 VIP 고객의 할인 비율이 다르므로 override
        return price - (int) (price * saleRatio);
    }

    public int getAgentID() {
        return agentID;
    }
}
