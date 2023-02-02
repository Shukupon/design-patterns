package shukupon.designpatterns.abstractFactory.boxFactory;

import java.util.List;
/**
 * 垂直な区切りを追加するためのインターフェース.
 * 
 * @author Shukupon
 *
 */
public interface VerticalLine extends Line {
	public void addLine(List<List<String>> box);
}
