package state;

public class AbstractState implements State {
    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void dispatchCaseEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void applyEndCaseEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void applyReturnEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void endCaseSuccessEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void endCaseFailEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public String getCurrentState() {
        return null;
    }
}
