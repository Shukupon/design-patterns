package shukupon.designpatterns.interpreter;

public class PrimitiveCommandNode implements Node {

    private String vector;
    
    @Override
    public void parse(Context context) throws ParseException {
        
        vector = context.currentToken();
        if(vector == null) {
            throw new ParseException("Error: Missing <primitive command>");
        }else if(!vector.matches("^\\([+-]?\\d+,[+-]?\\d+\\)$")) {
            throw new ParseException("Error: Unknown <primitive command>: " + vector);
        }
        context.skipToken(vector);

    }
    
    public void execute(Character target) {
        
        target.move(vector);
    }
    
    public String toString() {
        return vector;
    }

}
