package shukupon.designpatterns.state;

/**
 * Stateを管理するクラス.
 * 
 * @author Shukupn
 *
 */
public class Coordinater {
    private Player player1;
    private Player player2;

    public Coordinater() {
        player1 = FrontPlayer.getInstance();
        player2 = BackPlayer.getInstance();
    }

    public void respondBall(String ball) {
        switch (ball) {
        case "player1側に浅いボール":
            System.out.println("player1: ");
            player1.respondFrontOwnSide();
            System.out.println("player2: ");
            player2.respondFrontOppositeSide();
            break;

        case "player2側に浅いボール":
            System.out.println("player1: ");
            player1.respondFrontOppositeSide();
            System.out.println("player2: ");
            player2.respondFrontOwnSide();
            break;

        case "player1側に深いボール":
            System.out.println("player1: ");
            player1.respondBackOwnSide();
            System.out.println("player2: ");
            player2.respondBackOppositeSide();
            break;

        case "player2側に深いボール":
            System.out.println("player1: ");
            player1.respondBackOppositeSide();
            System.out.println("player2: ");
            player2.respondBackOwnSide();
            break;

        }
    }

    public void changePosition() {
        if(player1 == FrontPlayer.getInstance() && player2 == BackPlayer.getInstance()) {
            player1 = BackPlayer.getInstance();
            player2 = FrontPlayer.getInstance();
        }else {
            
        }
        System.out.println("前衛と後衛を入れ替わります。");
    }

}
