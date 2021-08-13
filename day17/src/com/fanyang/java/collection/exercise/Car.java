package com.fanyang.java.collection.exercise;

import java.util.Objects;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-10 19:22
 */
public class Car {
    private String carName;
    private int carPrice;
    public Car(){}
    public Car(String name,int price){
        this.carName = name;
        this.carPrice = price;
    }
    public void setCarName(String name){
        this.carName = name;
    }public void setCarPrice(int price){
        this.carPrice = price;
    }
    public String getCarName(){
        return carName;
    }
    public int getCarPrice(){
        return carPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getCarPrice() == car.getCarPrice() &&
                Objects.equals(getCarName(), car.getCarName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarName(), getCarPrice());
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
