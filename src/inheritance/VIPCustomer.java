package inheritance;

public class VIPCustomer extends Customer { //Customer 상속받음
    private int agentID;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }
}
