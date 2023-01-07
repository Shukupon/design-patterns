package shukupon.designpatterns.factoryMethod;

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
