package shukupon.designpatterns.templateMethod;

/**
 * Template Methodの処理の内容を実装する具象クラス.
 * 
 * @author Shukupon
 *
 */
public class Sake extends Drink {

	@Override
	public void prepareGlass() {
		System.out.println("徳利を1つ用意します。");

	}

	@Override
	public void make() {
		System.out.println("注文された日本酒を徳利に1合分注ぎます。");

	}

	@Override
	public void bring() {
		System.out.println("日本酒を注いだ徳利と人数分のお猪口をお客様にお出しします。");

	}

}
