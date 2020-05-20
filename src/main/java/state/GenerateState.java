package state;

public class GenerateState extends AbstractState {
    @Override
    public void checkEvent(Context context) {
        System.out.println(" 建案成功 ");
    }

    @Override
    public void checkFailEvent(Context context) {
        System.out.println(" 建案失败 ");
    }

    @Override
    public void dispatchCaseEvent(Context context) {
        context.setState(new ProcessingState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }
}
