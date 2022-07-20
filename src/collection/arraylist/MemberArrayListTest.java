package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(101,"나");
        Member member2 = new Member(102,"나나");
        Member member3 = new Member(103,"나나나");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);

        memberArrayList.showAll();

        memberArrayList.removeMember(member1.getMemberID());

        memberArrayList.showAll();
    }
}
