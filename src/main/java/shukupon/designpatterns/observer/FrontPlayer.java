package shukupon.designpatterns.observer;

/**
 * Concrete Observerのクラス.
 * 
 * @author Shukupon
 *
 */
public class FrontPlayer implements Observer {

    @Override
    public void update(Ball tennisBall) {
        String state = tennisBall.getState();
        switch (state) {
        case "相手が打ち返した瞬間":
            System.out.println("前衛： スプリットステップを踏みます。");
            break;

        case "自サイドに浅いボール":
            System.out.println("前衛： 前に詰めてボレーで打ち返します。");
            break;

        case "自サイドに深いボール":
            System.out.println("前衛： サービスラインまで下がりサイドチェンジを行い、後衛の打ち返すボールに備えます。");
            break;

        case "逆サイドに浅いボール":
            System.out.println("前衛： 走って打ち返し、そのままサイドチェンジを行います。");
            break;
            
        case "逆サイドに深いボール":
            System.out.println("前衛： サービスラインまで下がり、後衛の打ち返すボールに備えます。");
            break;
            
        default:
            System.out.println("前衛： 臨機応変に対応します。");
            break;
        }

    }

}
