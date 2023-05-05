package shukupon.designpatterns.proxy;
/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {
    
    public static void main(String[] args) {
        
        Drink proxy1 = new LiquorProxy("ビール");
        Drink proxy2 = new LiquorProxy("日本酒");
        
        System.out.println(proxy1.getName());
        System.out.println(proxy2.getName());
        proxy1.print();
        proxy2.print();
    }

}
