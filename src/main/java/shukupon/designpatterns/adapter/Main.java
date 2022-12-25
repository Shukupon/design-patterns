package shukupon.designpatterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * adapterを利用する実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {

		// 委譲を使ったadapter pattern
		LiquorStock liquorStock = new LiquorStock(
				new ArrayList<String>(Arrays.asList("Wine", "Whiskey", "Sake", "Shochu")));
		
		// MainクラスはLiquorShelfを知らずに利用できる
		liquorStock.showStock();
		liquorStock.addStock("Beer");
		liquorStock.showStock();
	}

}
