package shukupon.designpatterns.chainOfResponsibility;

/**
 * 実際に処理を実装するクラス.
 * 
 * @author Shukupon
 *
 */
public class DrinkShochu extends Drink {

    public DrinkShochu(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Alcohol alcohol) {
        if (alcohol.getKind() == Kind.SHOCHU) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "グラスの1/5程焼酎を注ぎ、そのあとに炭酸水または三ツ矢サイダーをグラス一杯に注ぎ、ステアして飲みます。";
    }

}
