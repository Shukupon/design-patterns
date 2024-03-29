package shukupon.designpatterns.prototype;

public class Shochu implements Bottle {

	private String name;
	private int amount;
	
	public Shochu(String name, int amount) {
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
		Bottle clone = new Shochu(name, amount);
		return clone;
	}
}
