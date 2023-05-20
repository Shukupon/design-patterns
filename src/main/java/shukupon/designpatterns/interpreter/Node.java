package shukupon.designpatterns.interpreter;

/**
 * 最上位のインターフェース.
 * 
 * @author Shukupon
 *
 */
public interface Node {

    public void parse(Context context) throws ParseException;

    public void execute(Character target);
}
