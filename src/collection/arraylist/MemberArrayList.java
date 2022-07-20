package collection.arraylist;

import collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        /*
        for(int i=0; i<arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberID();
            if(memberId == tempId) {
                arrayList.remove(i);
                return true;
            }
        } */

        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) { //다음 번에 가져올 element가 있는가?
            Member member = iterator.next();

            int tempId = member.getMemberID();
            if (memberId == tempId) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println(arrayList);
    }
}
