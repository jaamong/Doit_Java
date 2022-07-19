package classEx;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Person person = new Person();

        Class pClass1 = person.getClass(); //getClass() : Object의 메서드, Class 클래스를 반환

        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("classEx.Person"); //문자열로 써서 그 클래스가 있으면 메모리에 적재시킴 : 동적로딩
        System.out.println(pClass3.getName());


        Class pClass = Class.forName("classEx.Person");
        Person p1 = (Person)pClass.newInstance(); //call Default Constructor
        System.out.println(p1);
    }
}
