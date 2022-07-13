package scheduler;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("고객의 등급이 높은 고객의 전화를 가져온다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업우 skill이 가장 높은 상담원의 대기열에 앞에 우선 배분한다.");
    }
}
