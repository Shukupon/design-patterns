package shukupon.designpatterns.bridge.waiter;

import shukupon.designpatterns.bridge.drink.Drink;

/**
 * 実装を利用する機能パッケージの最上位のクラス.
 * 
 * @author Shukupon
 *
 */
public class Waiter {

	private Drink drink;

	public Waiter(Drink drink) {
		this.drink = drink;
	}

	public void prepareGlass() {
		drink.rawPrepareGlass();
	};

	public void make() {
		drink.rawMake();
	};

	public void bring() {
		drink.rawBring();
	};

	public void serve() {
		prepareGlass();
		make();
		bring();
	}
}
