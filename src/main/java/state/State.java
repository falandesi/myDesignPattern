package state;

public interface State {
    void checkEvent(Context context);
    void checkFailEvent(Context context);
    void dispatchCaseEvent(Context context);
    void applyEndCaseEvent(Context context);
    void applyReturnEvent(Context context);
    void endCaseSuccessEvent(Context context);
    void endCaseFailEvent(Context context);
    String getCurrentState();
}
