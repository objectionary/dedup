import commands.Command;
import commands.Commands;


public class Main {
    public static void main(String[] args) throws Exception { //TODO: throw exact exceptions
        Commands lst = new Commands();
        for (String i : args) {
            Command command = null;
            for (Command c : lst.get()) {
                if (i.split("=")[0].equals(c.GetName())) {
                    command = c.getClass().newInstance(); //idk how to write this better :(
                    command.Execute();
                }
            }
            if (command == null) {
                throw new Exception("invalid command");
            }
        }
    }
}
