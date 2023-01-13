package shukupon.designpatterns.singleton;

/**
 * 単なるPOJOクラス.
 * 
 * @author Shukupon
 *
 */
public class Liquor {

	private String name;

	public Liquor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
