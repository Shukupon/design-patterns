package shukupon.designpatterns.abstractFactory.boxFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Abstract Factoryに相当するクラス.
 * 
 * @author Shukupon
 *
 */
public interface BoxFactory {

	static BoxFactory getBoxFactory(String boxFactoryName) {
		Class boxFactory = null;
		try {
			boxFactory = Class.forName(boxFactoryName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		BoxFactory concreteBoxFactory = null;
		try {
			concreteBoxFactory = (BoxFactory) boxFactory.getConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return concreteBoxFactory;
	}

	public List<List<String>> createBox(int height, int length);

	public Line createHorizontalLine();

	public Line createVerticalLine();
}
