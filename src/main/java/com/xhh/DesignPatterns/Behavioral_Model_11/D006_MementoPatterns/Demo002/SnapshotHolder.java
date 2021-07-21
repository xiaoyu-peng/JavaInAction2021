package com.xhh.DesignPatterns.Behavioral_Model_11.D006_MementoPatterns.Demo002;

import java.util.Stack;

public class SnapshotHolder {

    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}