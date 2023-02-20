package org.example.runner.model;

import org.example.crawler.model.Identifiable;

/**
 * Separate task that represented by separate thread.
 * Can be run on demand.
 *
 * @since 1.0-SNAPSHOT
 */
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
