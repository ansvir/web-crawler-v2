package org.example.runner.thread;

import java.util.ArrayList;
import java.util.List;

public class TaskPool {

    private final List<Runnable> tasks;

    public TaskPool() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Runnable r) {
        this.tasks.add(r);
    }

    public List<Runnable> getTasks() {
        return tasks;
    }

}
