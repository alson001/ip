package duke.tasks;

import java.util.List;

/**
 * TaskList represents the list of tasks.
 */
public class TaskList {

    private List<Task> taskList;

    /**
     * Returns a list of tasks saved.
     * @return List of tasks.
     */
    public List<Task> getTaskList() {
        return taskList;
    }

    /**
     * Edit a list of tasks.
     * @param taskList New list of the tasks.
     * @return Edited list of tasks.
     */
    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    /**
     * Return a task from a list of tasks.
     * @param index Index of task to retrieve.
     * @return A specified task.
     */
    public Task getTask(int index) {
        return taskList.get(index);
    }

    /**
     * Return size of list of tasks.
     * @return number of tasks in list.
     */
    public int getSize() {
        return taskList.size();
    }

    /**
     * Add task to list of tasks.
     * @param newTask Add new task.
     */
    public void addTask(Task newTask) {
        taskList.add(newTask);
    }

    /**
     * Removes the Task at the given index from the TaskList.
     *
     * @param index The given index.
     * @return The task removed.
     */
    public Task removeTask(int index) {
        return taskList.remove(index);
    }

    /**
     * Marks the Task at the given index as uncompleted.
     *
     * @param index The given index.
     * @return The Task unmarked.
     */
    public Task markTask(int index) {
        Task task = taskList.get(index);
        task.mark();
        return task;
    }

    /**
     * Marks the Task at the given index as uncompleted.
     *
     * @param index The given index.
     * @return The Task unmarked.
     */
    public Task unmarkTask(int index) {
        Task task = taskList.get(index);
        task.unmark();
        return task;
    }


}
