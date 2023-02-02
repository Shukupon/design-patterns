package shukupon.designpatterns.abstractFactory.plusBoxFactory;

import java.util.List;

import shukupon.designpatterns.abstractFactory.boxFactory.VerticalLine;

/**
 * 垂直な区切りを追加するためのクラス.
 * 
 * @author Shukupon
 *
 */
public class ConcreteVerticalLine implements VerticalLine {

	private String chr;
	private int width = 2;
	private int index = 0;

	public ConcreteVerticalLine(String chr) {
		this.chr = chr;
	}

	@Override
	public void addLine(List<List<String>> box) {

		int height = box.size();
		int length = box.get(0).size();

		for (int i = 0; i < (float)(length - 2) / (float)width - 1; i++) {
			// なぜかこれで上端だけでなく下端にも"+"が追加されてしまう.どうして...
			box.get(0).add(index + width + 1, "+");
			for (int j = 0; j < height - 2; j++) {
				box.get(j + 1).add(index + width + 1, chr);
			}
			//box.get(height - 1).add(index + width + 1, "+");
			index += width + 1;
		}

	}
}
