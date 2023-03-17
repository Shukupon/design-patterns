package shukupon.designpatterns.chainOfResponsibility;
/**
 * 処理を行うクラスの共通基盤.
 * @author Shukupon
 *
 */
public abstract class Drink {
    private String name;
    private Drink next;
    
    public Drink(String name) {
        this.name = name;
        next = null;
    }

    public Drink setNext(Drink drink) {
        next = drink;
        return next;
    }
    
    public void drink(Alcohol alcohol) {
        if(resolve(alcohol)) {
            System.out.println(this);
        }else if(next != null) {
            next.drink(alcohol);
        }else {
            System.out.println("飲み方がわかりません。");
        }
    }
    
    protected abstract boolean resolve(Alcohol alcohol);
    
}
