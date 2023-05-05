package shukupon.designpatterns.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyWeightのクラスを生成・管理するクラス.
 * 
 * @author Shukupon
 *
 */
public class LiquorFactory {

    private Map<String, Liquor> pool = new HashMap<>();
    private static LiquorFactory singleton = new LiquorFactory();

    private LiquorFactory() {

    }

    public static LiquorFactory getInstance() {
        return singleton;
    }

    public Liquor getLiquor(String name) {
        if (!pool.containsKey(name)) {
            pool.put(name, new Liquor(name));
        }
        return pool.get(name);
    }
}
