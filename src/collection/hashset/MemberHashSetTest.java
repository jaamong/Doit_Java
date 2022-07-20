package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(101, "나");
        Member member2 = new Member(102, "나2");
        Member member3 = new Member(103, "나3");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        memberHashSet.showAll();

        Member member = new Member(101, "엥");
        memberHashSet.addMember(member);
        memberHashSet.showAll();
    }
}
