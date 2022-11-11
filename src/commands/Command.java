package commands;

public abstract class Command {
    public Command(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private final String name;
    private final String description;

    public void Execute() {
    }

    public String GetInfo() {
        return description;
    }

    public String GetName() {
        return name;
    }
}
