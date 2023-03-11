package shukupon.designpatterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Package implements Drink, Iterable<Drink> {

    private String name;
    private List<Drink> drinks;

    public Package(String name, ArrayList<Drink> drinks) {
        this.name = name;
        this.drinks = drinks;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmount() {
        int amount = 0;
        for (Drink drink : drinks) {
            amount += drink.getAmount();
        }
        return amount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Iterator<Drink> iterator() {
        return drinks.iterator();
    }

}
