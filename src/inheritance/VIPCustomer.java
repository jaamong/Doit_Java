package inheritance;

public class VIPCustomer extends Customer { //Customer 상속받음
    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName) {

        //precompile 때 하위 클래스에서 super();를 이용하여 상위 클래스의 default constructor를 호출
        //default constructor가 아닌 인자가 있는 생성자인 경우 super를 명시적으로 호출하고 그 안에 인자를 넣어준다.
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 호출");
    }

    public int getAgentID() {
        return agentID;
    }
}
