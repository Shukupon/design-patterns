package shukupon.designpatterns.composite;

import java.util.ArrayList;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

    public static void main(String[] args) {

        Drink sake = new Bottle("東一", 720);
        Drink pack = new Package("獺祭飲み比べセット", new ArrayList<Drink>() {
            {
                add(new Bottle("6割磨き", 360));
                add(new Bottle("3割磨き", 360));
                add(new Bottle("特別純米", 360));
                add(new Package("お試しセット", new ArrayList<Drink>() {
                    {
                        add(new Bottle("獺祭梅酒", 180));
                        add(new Bottle("獺祭スパークリング", 180));
                    }
                }));
            }
        });
        
        Drink refrigerator = new Package("俺の酒蔵", new ArrayList<Drink>() {
            {
                add(sake);
                add(pack);
            }
        });
        
        System.out.println("現在「俺の酒蔵」には" + refrigerator.getAmount() + "ml日本酒が入っています。");
    }

}
