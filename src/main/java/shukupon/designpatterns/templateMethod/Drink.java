package shukupon.designpatterns.templateMethod;

/**
 * Template Methodを定義する抽象クラス.
 * 
 * @author Shukupon
 *
 */
public abstract class Drink {

	/**
	 * Template Method.
	 */
	public void serve() {

		prepareGlass();
		make();
		bring();
	}

	// 以下はそれぞれ具象クラスで実装する.
	public abstract void prepareGlass();

	public abstract void make();

	public abstract void bring();
}
