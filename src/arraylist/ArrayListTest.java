package arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        //Class ArrayList<E> : E는 element로 Generic 타입임
        //모든 자바 class의 최상위 class는 object
        ArrayList<String> list = new ArrayList<String>(); //String 타입으로 쓰겠다
        list.add("aaa");
        list.add("bbbb");
        list.add("cccccc");

        //ArrayList에서는 index 연산자를 제공하지 않는다. 순수 배열에서만 제공.
        for (String s : list) { //for(int i=0; i<list.size(); i++)
            System.out.println(s);
        }
    }
}
