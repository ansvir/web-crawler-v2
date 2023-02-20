package org.example.crawler.model;

import java.util.UUID;

public abstract class Identifiable {

    private final UUID id;

    public Identifiable() {
        this.id = UUID.randomUUID();
    }

    protected Identifiable(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

}
