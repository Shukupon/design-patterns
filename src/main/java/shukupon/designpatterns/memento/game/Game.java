package shukupon.designpatterns.memento.game;

/**
 * テニスのスコアを保持し計算するクラス.
 * 
 * @author Shukupon
 *
 */
public class Game {

    private int myScore = 0;
    private int opponentScore = 0;

    public void addMyScore() {
        System.out.println("あなたがポイントしました。");
        if (myScore == 0 || myScore == 15) {
            myScore += 15;
        } else if (myScore == 30) {
            myScore += 10;
        } else if (myScore == 40) {
            System.out.println("あなたの勝利です。");
            return;
        }
        System.out.println("現在のスコア:  " + myScore + " : " + opponentScore);
    }

    public void addOpponentScore() {
        System.out.println("相手がポイントしました。");
        if (opponentScore == 0 || opponentScore == 15) {
            opponentScore += 15;
        } else if (opponentScore == 30) {
            opponentScore += 10;
        } else if (opponentScore == 40) {
            System.out.println("相手の勝利です。");
            return;
        }
        System.out.println("現在のスコア:  " + myScore + " : " + opponentScore);
    }

    public Memento createMemento() {
        Memento memento = new Memento(myScore, opponentScore);
        return memento;

    }
    
    public void restoreMemento(Memento memento) {
        System.out.println("状態をある一時点に戻します。");
        myScore = memento.getMyScore();
        opponentScore = memento.getOpponentScore();
        System.out.println("現在のスコア:  " + myScore + " : " + opponentScore);
    }

}
