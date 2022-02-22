package bim;

import bim.command.Command;
import bim.command.ExitCommand;
import bim.task.TaskList;

public class Bim {

    private Ui ui;
    private Parser parser;
    private Storage storage;
    private TaskList tasks;

    public Bim() {
        ui = new Ui();
        parser = new Parser();
        storage = new Storage();
    }

    public void run() {
        ui.printWelcomeMessage();

        try {
            tasks = new TaskList(storage.loadDataFile());
        } catch (BimException exception) {
            ui.printErrorMessage(exception.getMessage());
        }

        boolean isExit = false;
        while(!isExit) {
            String fullCommand = parser.readInput();
            Command command = parser.parseCommand(fullCommand);
            ui.printLineSeparator();
            command.execute(tasks, ui, storage);
            if (command instanceof ExitCommand) {
                isExit = true;
            }
            else {
                ui.printLineSeparator();
            }
        }
    }


    public static void main(String[] args) {
        new Bim().run();
    }

}
