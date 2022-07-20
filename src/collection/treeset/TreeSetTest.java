package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        System.out.println(tree); //collection 프레임워크는 toString이 다 구현되어있음
                                  //정렬되어 나옴
    }
}
