package state;

public class ProcessingState extends AbstractState {
    @Override
    public void applyEndCaseEvent(Context context) {
        context.setState(new ApplyEndCaseState());
    }

    @Override
    public void applyReturnEvent(Context context) {
        context.setState(new GenerateState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PROCESSING.getValue();
    }
}
