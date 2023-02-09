package shukupon.designpatterns.bridge.waiter;

import shukupon.designpatterns.bridge.drink.Drink;
/**
 * 機能を拡張するクラス.
 * @author Shukupon
 *
 */
public class SeniorWaiter extends Waiter {

	public SeniorWaiter(Drink drink) {
		super(drink);
	}

	public void multiServe(int number) {
		prepareGlass();
		for(int i = 0; i < number; i++) {
			make();
		}
		bring();
	}
	
}
