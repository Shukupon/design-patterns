package shukupon.designpatterns.mediator;

/**
 * Concrete Mediator.
 * 
 * @author Shukupon
 *
 */
public class LabelMaker implements Mediator {

    public Colleague junmai;
    public Colleague honjyozou;
    public Colleague ginjyo;
    public Colleague daiGinjyo;
    public Colleague tokubetsu;
    private String label;

    public LabelMaker(Sake sake) {
        createColleagues();
        if (sake.getKojiRatio() <= 15 && !sake.isIsContainIngredientExceptRice()) {
            if (sake.getPolishingRatio() <= 50) {
                daiGinjyo.setColleagueEnabled(true);
            } else if (sake.getPolishingRatio() <= 60) {
                ginjyo.setColleagueEnabled(true);
            }
            if (sake.isContainJyozoAlcohol()) {
                honjyozou.setColleagueEnabled(true);
            } else {
                junmai.setColleagueEnabled(true);
            }
        }

    }

    // 各Colleagueを生成する.
    @Override
    public void createColleagues() {
        junmai = new Junmai();
        honjyozou = new Honjyozou();
        ginjyo = new Ginjyo();
        daiGinjyo = new DaiGinjyo();
        tokubetsu = new Tokubetsu();

        junmai.setMediator(this);
        honjyozou.setMediator(this);
        ginjyo.setMediator(this);
        daiGinjyo.setMediator(this);
        tokubetsu.setMediator(this);

    }

    // 各Colleagueの状態が変化した際に呼び出される.
    @Override
    public void colleagueChanged() {

        String temp = "";
        if (tokubetsu.isEnabled()) {
            temp += "特別";
        }
        if (junmai.isEnabled()) {
            temp += "純米";
        } else if (honjyozou.isEnabled()) {
            temp += "本醸造";
        }
        if (ginjyo.isEnabled()) {
            temp += "吟醸";
        } else if (daiGinjyo.isEnabled()) {
            temp += "大吟醸";
        }
        temp += "酒";

        label = temp;
        System.out.println("現在のラベル: " + getLabel());
    }

    public String getLabel() {
        return label;
    }

}
