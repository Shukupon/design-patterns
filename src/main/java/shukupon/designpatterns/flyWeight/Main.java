package shukupon.designpatterns.flyWeight;
/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {

    public static void main(String[] args) {
        
        LiquorShelf liquorShelf = new LiquorShelf();
        liquorShelf.addLiquor("ビール");
        liquorShelf.addLiquor("ビール");
        liquorShelf.addLiquor("日本酒");
        liquorShelf.addLiquor("ビール");
        liquorShelf.addLiquor("日本酒");
        liquorShelf.print();
    }
}
