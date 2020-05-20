package state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        try {
            context.setState(new GenerateState());
//            context.endCaseFailEvent(context);
            context.getCurrentState();
            context.dispatchCaseEvent(context);
//            context.getCurrentState();
            context.applyEndCaseEvent(context);
            context.endCaseSuccessEvent(context);
//            context.getCurrentState();
            context.checkEvent(context);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
