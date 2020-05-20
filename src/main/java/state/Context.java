package state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context extends AbstractState {
    private State state;

    @Override
    public void checkEvent(Context context) {
        this.state.checkEvent(this);
        this.getCurrentState();
    }

    @Override
    public void checkFailEvent(Context context) {
        this.state.checkFailEvent(this);
        this.getCurrentState();
    }

    @Override
    public void dispatchCaseEvent(Context context) {
        this.state.dispatchCaseEvent(this);
        this.getCurrentState();
    }

    @Override
    public void applyEndCaseEvent(Context context) {
        this.state.applyEndCaseEvent(this);
        this.getCurrentState();
    }

    @Override
    public void applyReturnEvent(Context context) {
        this.state.applyReturnEvent(this);
        this.getCurrentState();
    }

    @Override
    public void endCaseSuccessEvent(Context context) {
        this.state.endCaseSuccessEvent(this);
        this.getCurrentState();
    }

    @Override
    public void endCaseFailEvent(Context context) {
        this.state.endCaseFailEvent(this);
        this.getCurrentState();
    }

    public String getCurrentState() {
        System.out.println("当前状态 : " + this.state.getCurrentState());
        return this.state.getCurrentState();
    }
}
