package shukupon.designpatterns.interpreter;

/**
 * 命令の対象となるクラス.
 * 
 * @author Shukupon
 *
 */
public class Character {

    private int x;
    private int y;

    public Character(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println(this);
    }
    
    public void move(String vector) {
        this.x += Integer.parseInt(vector.substring(1, vector.indexOf(",")));
        this.y += Integer.parseInt(vector.substring(vector.indexOf(",") + 1, vector.indexOf(")")));
        System.out.println(this);
    }
    
    public void reset() {
        x = 0;
        y = 0;
    }

    public String toString() {
        return "現在地は(" + x + ", " + y + ")です。";
    }
}
