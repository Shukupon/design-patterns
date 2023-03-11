package shukupon.designpatterns.visitor;

public class Bottle implements Drink {

    private String name;
    private int amount;

    public Bottle(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
