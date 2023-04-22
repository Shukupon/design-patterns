package shukupon.designpatterns.state;
/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {

    public static void main(String[] args) {
        
        Coordinater coordinater = new Coordinater();
        
        coordinater.respondBall("player1側に浅いボール");
        System.out.println();
        coordinater.respondBall("player2側に深いボール");
        System.out.println();
        coordinater.changePosition();
        System.out.println();
        coordinater.respondBall("player1側に浅いボール");
        System.out.println();
        coordinater.respondBall("player2側に深いボール");
    }
}
