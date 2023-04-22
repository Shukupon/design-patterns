package shukupon.designpatterns.state;

/**
 * Concrete Stateとなるクラス.
 * 
 * @author Shukupon
 *
 */
public class BackPlayer implements Player {

    private static Player singleton = new BackPlayer();
    
    private BackPlayer() {
    }
    
    public static Player getInstance() {
        return singleton;
    }
    
    @Override
    public void respondFrontOwnSide() {
        System.out.println("後衛： サイドチェンジを行い、前衛の打ち返すボールに備えます。");

    }

    @Override
    public void respondFrontOppositeSide() {
        System.out.println("後衛： 前衛の打ち返すボールに備えます。");

    }

    @Override
    public void respondBackOwnSide() {
        System.out.println("後衛： ストロークで打ち返します。");

    }

    @Override
    public void respondBackOppositeSide() {
        System.out.println("後衛： 走って打ち返し、そのままサイドチェンジを行います。");

    }

}
