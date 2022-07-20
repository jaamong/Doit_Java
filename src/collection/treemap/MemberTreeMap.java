package collection.treemap;

import collection.Member;
import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberId) {
        if(treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        Iterator<Integer> ir = treeMap.keySet().iterator(); //키 값

        while(ir.hasNext()) {
            int key = ir.next();

            Member member = treeMap.get(key);
            System.out.println(member);
        }
    }
}
