package shukupon.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototypeとなるクラスを管理するクラス.
 * @author Shukupon
 *
 */
public class Manager {

	private List<Bottle> bottles = new ArrayList<>();
	
	public void order(Bottle bottle, int num) {
		bottles.add(bottle);
		for(int i = 0; i < num; i++) {
			bottles.add(bottle.create());
		}
	}
	
	public void showList() {
		for(Bottle bottle : bottles) {
			System.out.println("名前: " + bottle.getName() + ", 内容量: " + bottle.getAmount());
		}
	}
}
