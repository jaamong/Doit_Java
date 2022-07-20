package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1); //내림차순 반환
    }
}

public class ComparatorTest {
    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>(new MyCompare()); //Comparator의 compare을 사용하기 위해 생성자에 default constructor 호출

        tree.add("aaa");
        tree.add("bbb");
        tree.add("ccc");

        System.out.println(tree);
    }
}