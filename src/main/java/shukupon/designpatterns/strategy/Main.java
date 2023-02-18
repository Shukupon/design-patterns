package shukupon.designpatterns.strategy;

import shukupon.designpatterns.strategy.strategies.ServeSake;
import shukupon.designpatterns.strategy.strategies.ServeShochu;

public class Main {

	public static void main(String[] args) {

		Waiter sakeWaiter = new Waiter(new ServeSake());
		Waiter shochuWaiter = new Waiter(new ServeShochu());

		sakeWaiter.serveDrink();
		shochuWaiter.serveDrink();

	}

}
