package collection.treeset;

import collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> iterator = treeSet.iterator();

        while(iterator.hasNext()) {
            Member member = iterator.next();

            int tempId = member.getMemberID();
            if(memberId == tempId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for(Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
