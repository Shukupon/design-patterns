package shukupon.designpatterns.strategy.strategies;

/**
 * Concrete Strategyとなるクラス.
 * @author Shukupon
 *
 */
public class ServeSake implements ServeDrinkMethod {

	@Override
	public void serve() {
		prepareGlass();
		make();
		bring();

	}

	private void prepareGlass() {
		System.out.println("徳利を1つ用意します。");

	}

	private void make() {
		System.out.println("注文された日本酒を徳利に1合分注ぎます。");

	}

	private void bring() {
		System.out.println("日本酒を注いだ徳利と人数分のお猪口をお客様にお出しします。");

	}

}
