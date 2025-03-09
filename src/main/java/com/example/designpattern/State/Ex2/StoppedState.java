package com.example.designpattern.State.Ex2;

public class StoppedState implements State {
    @Override
    public void play(VideoPlayer player) {
        System.out.println("Starting the video..");
        player.setState(new PlayingState());
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("Video is already stopped.");
    }
}
