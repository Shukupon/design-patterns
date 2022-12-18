package shukupon.designpatterns.iterator;

/**
 * iteratorで取り出す対象のクラス.
 * 
 * @author Shukupon
 *
 */
public class Liquor {

	public Liquor(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	};

}
