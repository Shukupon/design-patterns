package shukupon.designpatterns.mediator;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

    public static void main(String[] args) {
        LabelMaker labelMaker = new LabelMaker(new Sake(60, 15, false, true));
        labelMaker.honjyozou.setColleagueEnabled(false);
        labelMaker.junmai.setColleagueEnabled(true);

    }

}
