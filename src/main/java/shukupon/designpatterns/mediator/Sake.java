package shukupon.designpatterns.mediator;

public class Sake {

    // 精米歩合
    private int polishingRatio;
    // こうじ米使用割合
    private int kojiRatio;
    // 米以外
    private boolean isContainIngredientExceptRice;
    // 醸造アルコール
    private boolean isContainJyozouAlcohol;

    public Sake(int polishingRatio, int kojiRatio, boolean isContainIngredientExceptRice, boolean isContainJyozouAlcohol) {
        this.polishingRatio = polishingRatio;
        this.kojiRatio = kojiRatio;
        this.isContainIngredientExceptRice = isContainIngredientExceptRice;
        this.isContainJyozouAlcohol = isContainJyozouAlcohol;
    }

    public int getPolishingRatio() {
        return polishingRatio;
    }

    public int getKojiRatio() {
        return kojiRatio;
    }

    public boolean isIsContainIngredientExceptRice() {
        return isContainIngredientExceptRice;
    }

    public boolean isContainJyozoAlcohol() {
        return isContainJyozouAlcohol;
    }

}
