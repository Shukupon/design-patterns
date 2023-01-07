package shukupon.designpatterns.factoryMethod.impl;

import shukupon.designpatterns.factoryMethod.framework.Log;

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
