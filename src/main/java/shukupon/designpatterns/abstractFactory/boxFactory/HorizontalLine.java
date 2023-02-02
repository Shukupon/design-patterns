package shukupon.designpatterns.abstractFactory.boxFactory;

import java.util.List;

/**
 * 水平な区切りを追加するためのインターフェース.
 * 
 * @author Shukupon
 *
 */
public interface HorizontalLine extends Line {

	public void addLine(List<List<String>> box);
}
