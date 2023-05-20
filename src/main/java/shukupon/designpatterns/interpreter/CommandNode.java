package shukupon.designpatterns.interpreter;

public class CommandNode implements Node {

    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }

    }

    public String toString() {
        return node.toString();
    }

    @Override
    public void execute(Character target) {
        node.execute(target);
        
    }

}
