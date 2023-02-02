package shukupon.designpatterns.abstractFactory.boxFactory;

import java.util.List;

/**
 * HorizontalLineとVerticalLineを同様に操作するためのインターフェース.
 * 
 * @author Shukupon
 *
 */
public interface Line {
	public void addLine(List<List<String>> box);
}
