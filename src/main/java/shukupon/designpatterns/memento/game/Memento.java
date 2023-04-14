package shukupon.designpatterns.memento.game;

/**
 * 一時的な状態を保存するMementoクラス.
 * 
 * @author Shukupon
 *
 */
public class Memento {

    private int myScore;
    private int opponentScore;

    Memento(int myScore, int opponentScore) {
        this.myScore = myScore;
        this.opponentScore = opponentScore;
    }

    public int getMyScore() {
        return myScore;
    };

    public int getOpponentScore() {
        return opponentScore;
    }

}
