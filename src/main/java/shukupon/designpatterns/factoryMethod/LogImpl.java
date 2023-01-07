package shukupon.designpatterns.factoryMethod;

/**
 * Logを実装するクラス.
 * 
 * @author Shukupon
 *
 */
public class LogImpl implements Log {

	@Override
	public void info(String str) {
		System.out.println(str + ":info");
	}
}
