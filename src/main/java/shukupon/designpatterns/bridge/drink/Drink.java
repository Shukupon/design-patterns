package shukupon.designpatterns.bridge.drink;

/**
 * 実装のパッケージの最上位にある、 実装のIFを定義するインターフェース.
 * 
 * @author Shukupon
 *
 */
public interface Drink {

	// 以下はそれぞれ具象クラスで実装する.
	public void rawPrepareGlass();

	public void rawMake();

	public void rawBring();
}
