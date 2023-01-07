package shukupon.designpatterns.factoryMethod.impl;

import shukupon.designpatterns.factoryMethod.framework.Log;
import shukupon.designpatterns.factoryMethod.framework.LogFactory;

/**
 * LogFactoryを実装し、Log型のインスタンスを返却するクラス.
 * 
 * @author Shukupon
 *
 */
public class LogFactoryImpl implements LogFactory {

	@Override
	public Log getLog() {
		return new LogImpl();
	}

}
