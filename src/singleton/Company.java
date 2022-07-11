package singleton;

public class Company {

    //TODO : 프로그램에서 단 하나만 존재해야함 -> 외부에서 선언하지 못하도록 private, 여러개가 아닌 하나만 존재하므로 static
    private static Company instance = new Company(); //프로그램에서 유일하게 사용될 객체

    //private constructor는 외부에서 호출 불가능 : 만들어놓지 않으면 컴파일 단계에서 만들어지는 default constructor로 인해 외부에서 호출이 가능하게 됨 -> 여러개의 Company 객체가 생성될 수 있음
    private Company() {}

    //외부에서 객체를 사용할 수 있도록 method 생성
    public static Company getInstance() { //객체를 생성하지 않고도 이 method를 호출할 수 있도록 static으로 선언 : class 이름으로 참조해서 사용
        if (instance == null)
            instance = new Company();
        return instance;
    }
}