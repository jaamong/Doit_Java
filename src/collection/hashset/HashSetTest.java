package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        boolean b1 = set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);
        System.out.println(b1);

        boolean b2 = set.add("aaa");
        System.out.println(set); //중복 미허용
        System.out.println(b2);
    }
}
