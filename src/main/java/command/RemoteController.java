package command;


// 遥控器类
public class RemoteController {
    ICommand[] onCommands = new ICommand[5];
    ICommand[] offCommands = new ICommand[5];
    ICommand undoCommand;

    public RemoteController() {
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, ICommand onCommand, ICommand offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void pushOnButton(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void pushOffButton(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void pushUndoButton() {
        undoCommand.undo();
    }
}
