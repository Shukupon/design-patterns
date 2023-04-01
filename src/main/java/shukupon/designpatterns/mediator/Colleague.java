package shukupon.designpatterns.mediator;

/**
 * Mediatorが指示を出すColleagueの抽象クラス.
 * 
 * @author Shukupon
 *
 */
public interface Colleague {

    public void setMediator(Mediator mediator);

    public void setColleagueEnabled(boolean enabled);

    public boolean isEnabled();
}
