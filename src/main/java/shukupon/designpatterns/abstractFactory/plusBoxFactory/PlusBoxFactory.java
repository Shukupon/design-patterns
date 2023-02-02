package shukupon.designpatterns.abstractFactory.plusBoxFactory;

import java.util.ArrayList;
import java.util.List;

import shukupon.designpatterns.abstractFactory.boxFactory.BoxFactory;
import shukupon.designpatterns.abstractFactory.boxFactory.Line;

/**
 * Abstract Factoryを実装するクラス.
 * 
 * @author Shukupon
 *
 */
public class PlusBoxFactory implements BoxFactory {

	@Override
	public List<List<String>> createBox(int height, int length) {
		// boxが生成できない条件の場合はnullを返却する
		if (height < 1 || length < 1)
			return null;
		List<List<String>> box = new ArrayList<>();
		List<String> edgeline = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			edgeline.add("+");
		}
		box.add(edgeline);

		// heightが1の場合は1行目のみを返却する
		if (height == 1)
			return box;

		for (int i = 0; i < height - 2; i++) {
			List<String> line = new ArrayList<>();
			line.add("+");
			for (int j = 0; j < length - 2; j++) {
				line.add(" ");
			}
			line.add("+");
			box.add(line);
		}

		box.add(edgeline);

		return box;
	}

	@Override
	public Line createHorizontalLine() {
		Line horizontalLine = new ConcreteHorizontalLine("-");
		return horizontalLine;
	}

	@Override
	public Line createVerticalLine() {
		Line verticalLine = new ConcreteVerticalLine("|");
		return verticalLine;
	}

}
