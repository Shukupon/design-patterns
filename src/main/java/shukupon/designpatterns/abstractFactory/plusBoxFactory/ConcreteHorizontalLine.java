package shukupon.designpatterns.abstractFactory.plusBoxFactory;

import java.util.ArrayList;
import java.util.List;

import shukupon.designpatterns.abstractFactory.boxFactory.HorizontalLine;

/**
 * 水平な区切りを追加するためのクラス.
 * 
 * @author Shukupon
 *
 */
public class ConcreteHorizontalLine implements HorizontalLine {

	private String chr;
	private int width = 2;
	private int index = 0;

	public ConcreteHorizontalLine(String chr) {
		this.chr = chr;
	}

	@Override
	public void addLine(List<List<String>> box) {

		int height = box.size();
		int length = box.get(0).size();

		List<String> horizontalLine = new ArrayList<>();
		horizontalLine.add("+");
		for (int i = 0; i < length - 2; i++) {
			horizontalLine.add(chr);
		}
		horizontalLine.add("+");

		for (int i = 0; i < (float)(height - 2) / (float)width - 1; i++) {
			box.add(index + width + 1, horizontalLine);
			index += width + 1;
		}

	}

}
