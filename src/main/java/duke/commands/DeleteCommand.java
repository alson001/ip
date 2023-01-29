package duke.commands;

import duke.exceptions.InvalidCmdValueException;
import duke.tasks.Task;
import duke.tasks.TaskList;
import duke.ui.Ui;
import duke.utils.Storage;

import java.io.File;

/**
 * DeleteCommand represents a command to delete a task from the TaskList.
 */
public class DeleteCommand extends Command {
    private Ui ui;
    private TaskList taskList;
    private int index;
    private Storage storage;
    private File file;

    /**
     * Creates a DeleteCommand to delete a ToDo, Event or Deadline from the TaskList.
     * @param ui The ui used
     * @param taskList The TaskList to delete the task from.
     * @param index The specified task to be deleted.
     * @param storage The storage to store the changes.
     * @param file The specified file to store the changes.
     * @throws InvalidCmdValueException If a delete command specify a wrong index.
     */
    public DeleteCommand(Ui ui, TaskList taskList, int index, Storage storage, File file) throws
            InvalidCmdValueException {
        if (index + 1 > taskList.getSize() || index < 0) {
            throw new InvalidCmdValueException();
        }
        this.ui = ui;
        this.taskList = taskList;
        this.index = index;
        this.storage = storage;
        this.file = file;
    }

    /**
     * Delete the task from the TaskList.
     */
    @Override
    public void action() {
        Task task = taskList.removeTask(index);
        ui.deleteResponse(task, taskList);
        storage.editStorage(taskList.getTaskList());
        storage.saveToFile(file);
    }
}
