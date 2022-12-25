package shukupon.designpatterns.adapter;

import java.util.List;

/**
 * adapteeに適用するadapterクラス.
 * 
 * @author Shukupon
 *
 */
public class LiquorStock implements Stock {

	private LiquorShelf liquorShelf;

	public LiquorStock(List<String> liquors) {
		liquorShelf = new LiquorShelf(liquors);
	}

	// LiquorShelfに手を加えることなく処理をStock用にカスタマイズできる
	@Override
	public void showStock() {
		System.out.println("アルコール類の在庫：");
		liquorShelf.showList();
	}

	@Override
	public void addStock(String item) {
		System.out.println("次の商品を追加しました :" + item);
		liquorShelf.addList(item);
	}

}
