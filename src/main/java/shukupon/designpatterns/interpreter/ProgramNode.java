package shukupon.designpatterns.interpreter;

public class ProgramNode implements Node {

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {

        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[program " + commandListNode + "]";
    }

    @Override
    public void execute(Character target) {
        commandListNode.execute(target);
        
    }

}
