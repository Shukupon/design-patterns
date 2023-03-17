package shukupon.designpatterns.chainOfResponsibility;

/**
 * 実際に処理を実装するクラス.
 * 
 * @author Shukupon
 *
 */
public class DrinkWhiskey extends Drink {

    public DrinkWhiskey(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Alcohol alcohol) {
        if (alcohol.getKind() == Kind.WHISKEY) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "グラスの1/5程ウィスキーを注ぎ、そのあとに三ツ矢サイダーまたはコーラをグラス一杯に注ぎ、ステアして飲みます。";
    }

}
