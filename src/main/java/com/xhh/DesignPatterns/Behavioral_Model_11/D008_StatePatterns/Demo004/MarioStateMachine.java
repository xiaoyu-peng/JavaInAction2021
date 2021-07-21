package com.xhh.DesignPatterns.Behavioral_Model_11.D008_StatePatterns.Demo004;

public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() { //TODO
    }

    public void obtainCape() {
    }

    public void obtainFireFlower() {
    }

    public void meetMonster() {
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}