package commands;

import commands.commands.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Commands {
    private static final List<Command> commands = new ArrayList<>();
    public Commands(){
        commands.add(new HelpCommand());

        commands.sort(Comparator.comparing(Command::GetName));
    }
    public static List<Command> get(){
        return commands;
    }
}
