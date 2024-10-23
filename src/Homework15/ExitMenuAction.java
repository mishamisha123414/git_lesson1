package Homework15;

public class ExitMenuAction implements MenuActions {


    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String getName() {
        return "Exit program";
    }
}
