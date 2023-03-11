package shukupon.designpatterns.visitor;

/**
 * データ構造から処理だけを抽出した Concrete Visitor.
 * 
 * @author Shukupon
 *
 */
public class SakeVisitor implements Visitor {

    @Override
    public void visit(Bottle bottle) {
        System.out.println(bottle.getName() + ": " + bottle.getAmount() + "ml");
    }

    @Override
    public void visit(Package pack) {
        System.out.println(pack.getName() + ": " + pack.getAmount() + "ml");
        for (Drink drink : pack) {
            drink.accept(this);
        }
    }

}
