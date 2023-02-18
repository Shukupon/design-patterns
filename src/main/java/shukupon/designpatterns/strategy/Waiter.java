package shukupon.designpatterns.strategy;

import shukupon.designpatterns.strategy.strategies.ServeDrinkMethod;

/**
 * Strategyを利用するクラス.
 * 
 * @author Shukupon
 *
 */
public class Waiter {

	private ServeDrinkMethod serveDrinkMethod;
	
	public Waiter(ServeDrinkMethod serveDrinkMethod) {
		this.serveDrinkMethod = serveDrinkMethod;
	}
	
	public void serveDrink(){
		serveDrinkMethod.serve();
	}
	
}
