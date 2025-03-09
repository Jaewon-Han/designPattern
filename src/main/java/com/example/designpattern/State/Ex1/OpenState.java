package com.example.designpattern.State.Ex1;

public class OpenState implements State {
    @Override
    public void open(Door door) {
        System.out.println("Door is already Open. ");
    }

    @Override
    public void close(Door door) {
        System.out.println("Door is now Closed.");
        door.setState(new ClosedState());
    }
}
