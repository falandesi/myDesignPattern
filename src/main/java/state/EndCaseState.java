package state;

public class EndCaseState extends AbstractState {

    @Override
    public void checkEvent(Context context) {
        System.out.println(" 案件已结案 ");
    }

    @Override
    public String getCurrentState() {
        return StateEnum.END_CASE.getValue();
    }
}
