package org.example.runner.thread;

import org.example.runner.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskPool {

    private final List<Task> tasks;

    public TaskPool() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task t) {
        this.tasks.add(t);
    }

    public void removeTask(Task task) {
        this.tasks.removeIf(t -> t.getId().equals(task.getId()));
    }

    public List<Task> getTasks() {
        return tasks;
    }

}
