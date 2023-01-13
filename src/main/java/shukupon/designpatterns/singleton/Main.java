package shukupon.designpatterns.singleton;

/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {
		
		LiquorShelf liquorShelf1 = LiquorShelf.getInstance();
		
		liquorShelf1.addLiquor("Wine");
		liquorShelf1.addLiquor("Whiskey");
		liquorShelf1.addLiquor("Shochu");
		liquorShelf1.addLiquor("Sake");
		
		liquorShelf1.showLiquorList();
		
		LiquorShelf liquorShelf2 = LiquorShelf.getInstance();
		
		liquorShelf2.addLiquor("Beer");
		liquorShelf2.showLiquorList();
	}
}
