package shukupon.designpatterns.factoryMethod;

import shukupon.designpatterns.factoryMethod.framework.Log;
import shukupon.designpatterns.factoryMethod.framework.LogFactory;
import shukupon.designpatterns.factoryMethod.impl.LogFactoryImpl;

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
