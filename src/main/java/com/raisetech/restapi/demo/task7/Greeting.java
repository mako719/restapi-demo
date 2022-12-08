package com.raisetech.restapi.demo.task7;

import jakarta.validation.constraints.Size;

public class Greeting {
    @Size(max = 19)
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
