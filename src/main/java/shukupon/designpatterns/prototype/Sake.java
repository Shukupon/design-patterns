package shukupon.designpatterns.prototype;

public class Sake implements Bottle {

	private String name;
	private int amount;

	public Sake(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public Bottle create() {
		Bottle b = null;
		b = (Bottle) clone();
		return b;
	}

	@Override
	public Bottle clone() {
		Bottle clone = new Sake(name, amount);
		return clone;
	}
}
