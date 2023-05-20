package shukupon.designpatterns.command;

public class MoveCommand implements Command {

    private int x;
    private int y;
    private Character target;

    public MoveCommand(int x, int y, Character target) {
        this.x = x;
        this.y = y;
        this.target = target;
    }

    @Override
    public void execute() {
        target.move(x, y);

    }

}
