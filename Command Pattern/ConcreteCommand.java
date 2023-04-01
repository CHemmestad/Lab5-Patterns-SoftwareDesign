public class ConcreteCommand implements Command { //Child class implemtents command because command is interface type
    private Reciever reciever;

    public ConcreteCommand(Reciever reciever) { //Constructor with Reciever type in parameters
        this.reciever = reciever;
    }

    @Override //Needs to override because it is an abstract function
    public void execute() {
        reciever.action();
    }
}
