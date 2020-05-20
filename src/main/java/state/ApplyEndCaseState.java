package state;

public class ApplyEndCaseState extends AbstractState {
    @Override
    public void endCaseSuccessEvent(Context context) {
        context.setState(new EndCaseState());
    }

    @Override
    public void endCaseFailEvent(Context context) {
        context.setState(new ProcessingState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.APPLY_END_CASE.getValue();
    }
}
