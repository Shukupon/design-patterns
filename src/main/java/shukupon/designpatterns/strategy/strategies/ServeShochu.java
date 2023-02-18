package shukupon.designpatterns.strategy.strategies;

/**
 * Concrete Strategyとなるクラス.
 * 
 * @author Shukupon
 *
 */
public class ServeShochu implements ServeDrinkMethod {

	@Override
	public void serve() {
		prepareGlass();
		make();
		bring();

	}

	private void prepareGlass() {
		System.out.println("切子グラスを用意します。");

	}

	private void make() {
		System.out.println("ストレート、ロック、水割り、お湯割りなどの飲み方に合わせて焼酎を作ります。");

	}

	private void bring() {
		System.out.println("焼酎の入ったグラスをお客様にお出しします。" + "ロックの場合はアイスペールを、" + "水割りの場合は水の入ったボトルとアイスペールを、"
				+ "お湯割りの場合はお湯の入ったポットを一緒にお出しします。");

	}

}
