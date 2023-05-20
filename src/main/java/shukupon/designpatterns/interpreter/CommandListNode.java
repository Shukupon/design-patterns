package shukupon.designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public class CommandListNode implements Node {

    private List<Node> list = new ArrayList<>();
    
    @Override
    public void parse(Context context) throws ParseException {
        while(true) {
            if(context.currentToken() == null ) {
                throw new ParseException("Error: Missing end");
            } else if(context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            }else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }

    }

    @Override
    public void execute(Character target) {
        for(Node node: list) {
            node.execute(target);
        }
        
    }
    
    public String toString() {
        return list.toString();
    }

}
