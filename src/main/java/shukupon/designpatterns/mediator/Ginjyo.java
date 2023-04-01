package shukupon.designpatterns.mediator;

public class Ginjyo implements Colleague {

    private Mediator mediator;
    private boolean enabled = false;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;

    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.enabled = enabled;
        mediator.colleagueChanged();
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

}
