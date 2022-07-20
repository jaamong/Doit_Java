package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet membertreeSet = new MemberTreeSet();

        Member member1 = new Member(102, "나");
        Member member2 = new Member(101, "나2");
        Member member3 = new Member(103, "나3");

        membertreeSet.addMember(member1);
        membertreeSet.addMember(member2);
        membertreeSet.addMember(member3);

        membertreeSet.showAll();
    }
}
