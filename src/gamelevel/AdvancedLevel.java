package gamelevel;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빠르게 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 한다.");
    }

    @Override
    public void turn() {
        System.out.println("turn할 줄 모른다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**** 중급자 레벨 *****");
    }
}
