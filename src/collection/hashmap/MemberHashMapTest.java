package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(102, "나");
        Member member2 = new Member(101, "나엥");
        Member member3 = new Member(103, "나나");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);

        memberHashMap.showAll();

        memberHashMap.removeMember(102);
        memberHashMap.showAll();
    }
}

