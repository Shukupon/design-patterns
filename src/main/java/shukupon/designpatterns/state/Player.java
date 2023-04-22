package shukupon.designpatterns.state;

/**
 * Stateのインターフェース.
 * 
 * @author Shukupon
 *
 */
public interface Player {

    public void respondFrontOwnSide();

    public void respondFrontOppositeSide();

    public void respondBackOwnSide();

    public void respondBackOppositeSide();
}
