public class CommandPattern {
    public static void main(String[] args) {
        Reciever reciever = new Reciever();
        Command command = new ConcreteCommand(reciever);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}