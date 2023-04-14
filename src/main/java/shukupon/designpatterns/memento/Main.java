package shukupon.designpatterns.memento;

import shukupon.designpatterns.memento.game.Game;
import shukupon.designpatterns.memento.game.Memento;

/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("1ゲームマッチを始めます。");
        
        Game game = new Game();
        game.addMyScore();
        game.addMyScore();
        Memento memento = game.createMemento();
        game.addOpponentScore();
        game.addOpponentScore();
        game.addOpponentScore();
        
        game.restoreMemento(memento);
        
        game.addMyScore();
        game.addMyScore();
    }

}
