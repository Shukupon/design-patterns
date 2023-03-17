package shukupon.designpatterns.chainOfResponsibility;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {
    
    public static void main(String[] args) {
        
        Drink sakenomi = new DrinkSake("sakenomi");
        Drink shochunomi = new DrinkShochu("shochunomi");
        Drink whiskeynomi = new DrinkWhiskey("whiskeynomi");
        
        Alcohol sake = new Alcohol("にいだしぜんしゅ", Kind.SAKE);
        Alcohol shochu = new Alcohol("魔王", Kind.SHOCHU);
        Alcohol whiskey = new Alcohol("アードベッグ", Kind.WHISKEY);
        Alcohol liquer = new Alcohol("あやしいお酒", Kind.OTHER);
        
        sakenomi.setNext(shochunomi).setNext(whiskeynomi);
        sakenomi.drink(sake);
        sakenomi.drink(shochu);
        sakenomi.drink(whiskey);
        sakenomi.drink(liquer);
    }

}
