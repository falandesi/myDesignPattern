package command;

public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("============按下打开电灯按钮============");
        remoteController.pushOnButton(0);
        System.out.println("============按下关闭电灯按钮============");
        remoteController.pushOffButton(0);
        System.out.println("============按下撤销按钮============");
        remoteController.pushUndoButton();

        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("============按下打开电视按钮============");
        remoteController.pushOnButton(1);
        System.out.println("============按下关闭电视按钮============");
        remoteController.pushOffButton(1);
        System.out.println("============按下撤销按钮============");
        remoteController.pushUndoButton();
    }
}
