package shukupon.designpatterns.interpreter;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

    public static void main(String[] args) {

        Character target = new Character(0, 0);
        Context context = new Context("program (-1,-1) repeat 5 (1,0) (0,1) end (10,10) end");
        try {
            Node node = new ProgramNode();
            node.parse(context);
            System.out.println("node = " + node);
            System.out.println();
            node.execute(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
