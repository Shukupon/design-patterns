package shukupon.designpatterns.visitor;

/**
 * Visitorのインターフェース.
 * 
 * @author Shukupon
 *
 */
public interface Visitor {

    public void visit(Bottle bottle);

    public void visit(Package pack);
}
