package collection;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member() {}

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberId;
    }

    public void setMemberID(int memberID) {
        this.memberId = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;

            if (this.memberId == member.memberId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Member member) { //매개변수가 비교대상
        //return (this.memberName.compareTo(member.memberName)); //String으로 비교, String에는 이미 compareTo가 구현되어 있음
        return (this.memberId - member.memberId); //양수인 경우 오름차순 tree
                                                  //음수인 겨우 내림차순 tree
    }

    @Override
    public int compare(Member member1, Member member2) { //member1 : 나, member2 : 비교대상
        return (member1.memberId - member2.memberId); //양수인 경우 오름차순 tree
    }
}
