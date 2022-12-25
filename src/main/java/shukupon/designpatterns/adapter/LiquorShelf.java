package shukupon.designpatterns.adapter;

import java.util.List;

/**
 * adapterを適用するadapteeクラス.
 * 
 * @author Shukupon
 *
 */
public class LiquorShelf {

	private List<String> liquors;

	public LiquorShelf(List<String> liquors) {
		this.liquors = liquors;
	}

	public void showList() {
		liquors.forEach(t -> System.out.println(t));
	}

	public void addList(String liquor) {
		liquors.add(liquor);
	}
}
