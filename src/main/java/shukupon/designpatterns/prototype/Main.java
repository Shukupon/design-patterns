package shukupon.designpatterns.prototype;
/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.order(new Sake("にいだしぜんしゅ", 720), 5);
		manager.order(new Shochu("杜谷", 360), 2);
		
		
		manager.showList();
	}
}
