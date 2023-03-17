package shukupon.designpatterns.chainOfResponsibility;

/**
 * 実際に処理を実装するクラス.
 * 
 * @author Shukupon
 *
 */
public class DrinkSake extends Drink {

    public DrinkSake(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Alcohol alcohol) {
        if(alcohol.getKind() == Kind.SAKE) {
            return true;
        }else {
            return false;
        }
    }

    public String toString() {
        return "常温に冷やしたものをお猪口に注いで飲みます。";
    }
    
}
