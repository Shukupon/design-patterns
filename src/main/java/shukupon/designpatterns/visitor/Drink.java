package shukupon.designpatterns.visitor;

/**
 * エントリーとなるインターフェース.
 * 
 * @author Shukupon
 *
 */
public interface Drink {

    public String getName();

    public int getAmount();

    public void accept(Visitor visitor);
}
