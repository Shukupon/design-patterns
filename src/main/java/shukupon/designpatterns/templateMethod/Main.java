package shukupon.designpatterns.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {

		// setup
		List<Drink> order = new ArrayList<>() {
			{
				add(new Sake());
				add(new Shochu());
			}
		};

		// execute
		order.forEach(t -> t.serve());

	}
}
