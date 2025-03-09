package com.example.designpattern.State.Ex1;

public class StateEx1Main {
    public static void main(String[] args) {
        Door door = new Door();

        door.open();   // Door is now Open
        door.open();   // Door is already Open.
        door.close();  // Door is now Closed.
        door.close();  // Door is already Closed;
    }
}
