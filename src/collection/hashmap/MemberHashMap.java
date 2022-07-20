package collection.hashmap;

import collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberId) {
        if(hashMap.containsKey(memberId)) {
            //hashMap.get(key); //key값을 주면 value를 반환한다.
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        Iterator<Integer> ir = hashMap.keySet().iterator(); //키 값

        while(ir.hasNext()) {
            int key = ir.next();

            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
