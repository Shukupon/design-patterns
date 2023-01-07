package shukupon.designpatterns.factoryMethod;
/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {
		
		LogFactory logFactory = new LogFactoryImpl();
		Log logger = logFactory.getLog();
		logger.info("これはインフォログです。");
	}
}
