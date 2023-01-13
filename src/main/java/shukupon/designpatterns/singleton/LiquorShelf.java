package shukupon.designpatterns.singleton;

/**
 * Singleton役のクラス.
 * 
 * @author Shukupon
 *
 */
public class LiquorShelf {
	private static LiquorShelf liquorShelf = new LiquorShelf();
	private final int max = 4;
	private Liquor[] liquors = new Liquor[4];
	private int index = 0; 

	private LiquorShelf(){
	}
	
	public static LiquorShelf getInstance() {
		return liquorShelf;
	}
	
	public void addLiquor(String str) {
		if(index < max) {
			Liquor liquor = new Liquor(str);
			System.out.println(liquor.getName() + "を棚に追加します。");
			liquors[index] = liquor;
			index++;
		}else {
			System.out.println("棚がいっぱいです。");
		}
		
	}

	public void showLiquorList() {
		for(Liquor liquor: liquors) {
			System.out.println(liquor.getName());
		}
	}
}
