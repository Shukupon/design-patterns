package shukupon.designpatterns.bridge;

import shukupon.designpatterns.bridge.drink.Drink;
import shukupon.designpatterns.bridge.drink.Sake;
import shukupon.designpatterns.bridge.drink.Shochu;
import shukupon.designpatterns.bridge.waiter.SeniorWaiter;
import shukupon.designpatterns.bridge.waiter.Waiter;

/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Drink drink1 = new Sake();
		Drink drink2 = new Shochu();
		
		Waiter waiter = new Waiter(drink1);
		waiter.serve();
		System.out.println();
		
		Waiter seniorWaiter1 = new SeniorWaiter(drink2);
		seniorWaiter1.serve();
		System.out.println();
		
		SeniorWaiter seniorWaiter2 = new SeniorWaiter(drink2);
		seniorWaiter2.multiServe(3);
	}
}
