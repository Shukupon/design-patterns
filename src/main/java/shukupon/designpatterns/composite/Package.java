package shukupon.designpatterns.composite;

import java.util.List;

public class Package implements Drink {

    private String name;
    private List<Drink> drinks;
    
    public Package(String name, List<Drink> drinks) {
        this.name = name;
        this.drinks = drinks;
        System.out.println(name + "を追加しました。");
    }
    
    @Override
    public int getAmount() {
        int temp = 0;
        for(Drink drink: drinks) {
            temp += drink.getAmount();
        }
        return temp;
    }

}
