package shukupon.designpatterns.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class Commands implements Command {

    private Deque<Command> commands = new ArrayDeque<>();
    
    public void addQueue(Command command) {
        if(this == command) {
            return;
        }
        commands.add(command);
    }
    
    @Override
    public void execute() {
        for(Command command: commands) {
            command.execute();
        }

    }

}
