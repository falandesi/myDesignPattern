package visitor;

public class Female extends Person {
    @Override
    public void accept(Action action) {
        action.getFemaleResult(this);
    }
}
