package shukupon.designpatterns.mediator;

public class Junmai implements Colleague {

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

    public boolean isEnabled() {
        return enabled;
    }

}
