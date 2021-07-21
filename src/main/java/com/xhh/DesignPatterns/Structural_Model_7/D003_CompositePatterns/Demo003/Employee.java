package com.xhh.DesignPatterns.Structural_Model_7.D003_CompositePatterns.Demo003;

public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}