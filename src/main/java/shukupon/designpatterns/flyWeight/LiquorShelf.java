package shukupon.designpatterns.flyWeight;

import java.util.ArrayList;
import java.util.List;

/**
 * 複数のFlyWeightを利用するクラス.
 * @author Shukupon
 *
 */
public class LiquorShelf {

    private List<String> liquors = new ArrayList<>();
    private LiquorFactory liquorFactory = LiquorFactory.getInstance();
    
    public void addLiquor(String name) {
        liquors.add(name);
    }
    
    public void print() {
        for(String liquor: liquors) {
            liquorFactory.getLiquor(liquor).print();
        }
    }
}
