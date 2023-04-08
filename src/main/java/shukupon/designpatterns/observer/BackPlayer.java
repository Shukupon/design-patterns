package shukupon.designpatterns.observer;

/**
 * Concrete Observerのクラス.
 * 
 * @author Shukupon
 *
 */
public class BackPlayer implements Observer {

    @Override
    public void update(Ball tennisBall) {
        String state = tennisBall.getState();
        switch (state) {
        case "相手が打ち返した瞬間":
            System.out.println("後衛： スプリットステップを踏みます。");
            break;

        case "自サイドに浅いボール":
            System.out.println("後衛： サイドチェンジを行い、前衛の打ち返すボールに備えます。");
            break;

        case "自サイドに深いボール":
            System.out.println("後衛： ストロークで打ち返します。");
            break;

        case "逆サイドに浅いボール":
            System.out.println("後衛： 前衛の打ち返すボールに備えます。");
            break;

        case "逆サイドに深いボール":
            System.out.println("後衛： 走って打ち返し、そのままサイドチェンジを行います。");
            break;

        default:
            System.out.println("後衛： 臨機応変に対応します。");
            break;
        }

    }

}
