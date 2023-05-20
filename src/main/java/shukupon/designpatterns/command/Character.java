package shukupon.designpatterns.command;

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
    
    public void reset() {
        x = 0;
        y = 0;
    }

    public String toString() {
        return "現在地は(" + x + ", " + y + ")です。";
    }
}
