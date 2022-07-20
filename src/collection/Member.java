package collection;

public class Member {

    private int memberId;
    private String memberName;

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
        if(obj instanceof Member) {
            Member member = (Member)obj;

            if(this.memberId == member.memberId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
