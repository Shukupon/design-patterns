package shukupon.designpatterns.state;

/**
 * Concrete Stateとなるクラス.
 * 
 * @author Shukupon
 *
 */
public class FrontPlayer implements Player {

    private static Player singleton = new FrontPlayer();

    private FrontPlayer() {
    }

    public static Player getInstance() {
        return singleton;
    }

    @Override
    public void respondFrontOwnSide() {
        System.out.println("前衛： 前に詰めてボレーで打ち返します。");

    }

    @Override
    public void respondFrontOppositeSide() {
        System.out.println("前衛： 走って打ち返し、そのままサイドチェンジを行います。");

    }

    @Override
    public void respondBackOwnSide() {
        System.out.println("前衛： サービスラインまで下がりサイドチェンジを行い、後衛の打ち返すボールに備えます。");

    }

    @Override
    public void respondBackOppositeSide() {
        System.out.println("前衛： サービスラインまで下がり、後衛の打ち返すボールに備えます。");

    }

}
