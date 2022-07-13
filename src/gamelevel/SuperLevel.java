package gamelevel;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("엄청 빨리 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높이 jump한다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급 레벨 *****");
    }
}
