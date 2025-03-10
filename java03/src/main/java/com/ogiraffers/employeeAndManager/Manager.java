package com.ogiraffers.employeeAndManager;

public class Manager extends Employee {

    private String position;

    public Manager(String name, String position, int salary) {

        super(name, salary);
        this.position = position;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                +" Manager ["
                +"position : "+this.position
                +"]";
    }
}
