package shukupon.designpatterns.command;
/**
 * 実行クラス.
 * @author Shukupon
 *
 */
public class Main {

    public static void main(String[] args) {
        
        Character target = new Character(0, 0);
        Commands commands = new Commands();
        commands.addQueue(new MoveCommand(1, 0, target));
        commands.addQueue(new MoveCommand(0, 1, target));
        commands.addQueue(new MoveCommand(-5, 0, target));
        commands.addQueue(new MoveCommand(1, 9, target));
        commands.execute();
        
        target.reset();
        System.out.println(target);
        
        Commands commands2 = new Commands();
        commands2.addQueue(new MoveCommand(5, 0, target));
        commands2.addQueue(new MoveCommand(5, 0, target));
        commands.addQueue(commands2);
        commands.execute();
    }
}
