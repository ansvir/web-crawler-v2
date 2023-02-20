package org.example.runner.model;

import org.example.crawler.model.Identifiable;

public class Task extends Identifiable implements Runnable {

    private final Runnable r;

    public Task(Runnable r) {
        this.r = r;
    }

    @Override
    public void run() {
        this.r.run();
    }

    public Runnable getRunnable() {
        return r;
    }

}
