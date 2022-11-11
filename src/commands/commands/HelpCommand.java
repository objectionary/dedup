package commands.commands;

import commands.Command;
import commands.Commands;


public class HelpCommand extends Command {
    public HelpCommand() {
        super("--help", "Prints information about all commands");
    }

    @Override
    public void Execute() {
        System.out.println("List of commands:");
        for (Command c : Commands.get()) {
            System.out.format("%s\t%s", c.GetName(), c.GetInfo());
        }
    }
}
