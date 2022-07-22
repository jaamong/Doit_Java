package exception;

public class IDformatTest {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IDformatException{
        if(userId == null) {
            throw new IDformatException("아이디는 null 일 수 없다.");
        } else if (userId.length() < 8 || userId.length() > 20) {
            throw new IDformatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }

        this.userId = userId;
    }

    public static void main(String[] args) {
        IDformatTest idTest = new IDformatTest();
        String userId = null;

        try {
            idTest.setUserId(userId);
        } catch (IDformatException e) {
            System.out.println(e);
        }

        userId = "1234567";
        try {
            idTest.setUserId(userId);
        } catch (IDformatException e) {
            System.out.println(e.getMessage());
        }
    }
}
