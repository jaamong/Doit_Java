package singleton;

public class CompanyTest {
    public static void main(String[] args) {

        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        //Company c3 = new Company(); //error code

        //c1, c2는 같은 instance를 가리키고 있다
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2); //true
    }
}
