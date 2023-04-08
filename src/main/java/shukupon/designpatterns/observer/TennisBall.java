package shukupon.designpatterns.observer;

/**
 * Observerの監視対象となるクラス.
 * 
 * @author Shukupon
 *
 */
public class TennisBall extends Ball {

    private String state = "";

    @Override
    public void setState(String state) {
        this.state = state;
        System.out.println("ボールの状態: " + state);
        notifyObservers();
        System.out.println();
    }

    @Override
    public String getState() {
        return state;
    }
}
