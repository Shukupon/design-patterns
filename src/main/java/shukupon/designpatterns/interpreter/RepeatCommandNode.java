package shukupon.designpatterns.interpreter;

public class RepeatCommandNode implements Node {

    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {

        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public void execute(Character target) {
        for(int i = 0; i < number; i++) {
            commandListNode.execute(target);
        }
    }
    
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }

}
