package com.example.designpattern.State.Ex1;

import lombok.Setter;

@Setter
public class Door {
    private State state;

    public Door() {
        this.state = new ClosedState();
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }
}
