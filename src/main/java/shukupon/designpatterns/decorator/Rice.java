package shukupon.designpatterns.decorator;

/**
 * Decoratorの基礎となるクラス.
 * 
 * @author Shukupon
 *
 */
public abstract class Rice {
    public abstract int getRow();

    public abstract int getColomn();

    public abstract String getText(int row);

    public void show() {
        for(int i = 0; i < getRow(); i++) {
            System.out.println(getText(i));
        }
    };

}
