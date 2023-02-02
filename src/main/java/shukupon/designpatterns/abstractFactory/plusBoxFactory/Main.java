package shukupon.designpatterns.abstractFactory.plusBoxFactory;

import java.util.List;

import shukupon.designpatterns.abstractFactory.boxFactory.BoxFactory;
import shukupon.designpatterns.abstractFactory.boxFactory.Line;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("使用するBoxFactoryをコマンドライン引数で指定してください。");
			return;
		}

		// factoryの生成
		BoxFactory factory = BoxFactory.getBoxFactory(args[0]);

		// 部品の生成
		List<List<String>> box = factory.createBox(6, 9);
		Line horizontalLine = factory.createHorizontalLine();
		Line verticalLine = factory.createVerticalLine();

		// boxの整形
		horizontalLine.addLine(box);
		verticalLine.addLine(box);

		// 結果表示
		box.forEach(list -> {
			list.forEach(System.out::print);
			System.out.println();
		});

	}
}
