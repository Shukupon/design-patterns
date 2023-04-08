package shukupon.designpatterns.observer;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

    public static void main(String[] args) {
        TennisBall tennisBall = new TennisBall();
        tennisBall.addObserver(new FrontPlayer());
        tennisBall.addObserver(new BackPlayer());
        try {
            tennisBall.setState("相手が打ち返した瞬間");
            Thread.sleep(800);

            tennisBall.setState("自サイドに浅いボール");
            Thread.sleep(800);
            
            tennisBall.setState("相手が打ち返した瞬間");
            Thread.sleep(800);
            
            tennisBall.setState("自サイドに深いボール");
            Thread.sleep(800);
            
            tennisBall.setState("相手が打ち返した瞬間");
            Thread.sleep(800);
            
            tennisBall.setState("逆サイドに浅いボール");
            Thread.sleep(800);
            
            tennisBall.setState("相手が打ち返した瞬間");
            Thread.sleep(800);
            
            tennisBall.setState("逆サイドに深いボール");
            Thread.sleep(800);
            
            tennisBall.setState("相手が打ち返した瞬間");
            Thread.sleep(800);
            
            tennisBall.setState("逆サイドに深いボール");
            Thread.sleep(800);
            
            tennisBall.setState("相手が打ち返した瞬間");
            Thread.sleep(800);
            
            tennisBall.setState("微妙なボール");
            Thread.sleep(800);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
