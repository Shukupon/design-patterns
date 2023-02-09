package shukupon.designpatterns.bridge.drink;

public class Sake implements Drink {

	@Override
	public void rawPrepareGlass() {
		System.out.println("徳利を1つ用意します。");

	}

	@Override
	public void rawMake() {
		System.out.println("注文された日本酒を徳利に1合分注ぎます。");

	}

	@Override
	public void rawBring() {
		System.out.println("日本酒を注いだ徳利と人数分のお猪口をお客様にお出しします。");

	}

}
