package com.xhh.DesignPatterns.Structural_Model_7.D003_CompositePatterns.Demo003;

public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}