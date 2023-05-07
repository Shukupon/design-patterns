package shukupon.designpatterns.proxy;
/**
 * 軽量なProxyとなるクラス.
 * @author Shukupon
 *
 */
public class LiquorProxy implements Drink {

    private String name;
    private Liquor real = null;

    public LiquorProxy(String name) {
        this.name = name;
    }

    public void print() {
        if(real == null) {
            realize();
        }
        real.print();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public synchronized void setName(String name) {
        if(real != null) {
            real.setName(name);
        }
        this.name = name;
    }
    
    private synchronized void realize() {
        real = new Liquor(name);
    }

}
