package shukupon.designpatterns.templateMethod;

/**
 * Template Methodの処理の内容を実装する具象クラス.
 * 
 * @author Shukupon
 *
 */
public class Shochu extends Drink {

	@Override
	public void prepareGlass() {
		System.out.println("切子グラスを用意します。");

	}

	@Override
	public void make() {
		System.out.println("ストレート、ロック、水割り、お湯割りなどの飲み方に合わせて焼酎を作ります。");

	}

	@Override
	public void bring() {
		System.out.println("焼酎の入ったグラスをお客様にお出しします。" 
				+ "ロックの場合はアイスペールを、" 
				+ "水割りの場合は水の入ったボトルとアイスペールを、"
				+ "お湯割りの場合はお湯の入ったポットを一緒にお出しします。");

	}

}
