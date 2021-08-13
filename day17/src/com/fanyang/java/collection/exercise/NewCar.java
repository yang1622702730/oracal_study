package com.fanyang.java.collection.exercise;

import java.util.Objects;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-11 10:51
 */
public class NewCar {
    private String name;
    private int speed;

    public NewCar(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public NewCar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewCar)) return false;
        NewCar newCar = (NewCar) o;
        return getSpeed() == newCar.getSpeed() &&
                Objects.equals(getName(), newCar.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSpeed());
    }

    @Override
    public String toString() {
        return "NewCar{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
