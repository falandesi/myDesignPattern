package visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStruct objectStruct = new ObjectStruct();
        objectStruct.attach(new Man());
        objectStruct.attach(new Female());
        Success success = new Success();
        objectStruct.display(success);
        System.out.println("=======================");
        Fail fail = new Fail();
        objectStruct.display(fail);
    }
}

