package inheritance;

public class Customer {

    //private은 외부클래스에서 볼 수 없음(접근 못함 == 가시성(visibility)없음)
    //외부클래스에서는 볼 수 없고 상속관계(package 달라도 OK)에서만 접근할 수 있도록 접근제어자 protected 사용
    //protected는 같은 package에서는 보임
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    /*
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }*/

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String) 호출");
    }

    public int calPrice(int price) {
        if (customerGrade == "SILVER") {
            bonusPoint += price * bonusRatio;
        }
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}