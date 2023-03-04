package shukupon.designpatterns.composite;

public class Bottle implements Drink {

    private String name;
    private int amount;
    
    public Bottle(String name, int amount) {
        this.name = name;
        this.amount = amount;
        System.out.println(name + "を追加しました。");
    }
    
    @Override
    public int getAmount() {

        return amount;
    }

}
