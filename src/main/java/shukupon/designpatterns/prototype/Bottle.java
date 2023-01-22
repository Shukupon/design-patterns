package shukupon.designpatterns.prototype;

/**
 * Prototypeで使うcloneを用意するインターフェース.
 * @author Shukupon
 *
 */
public interface Bottle extends Cloneable {

	public abstract String getName();
	public abstract int getAmount();
	public abstract Bottle create();
}
