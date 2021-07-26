package com.fanyang.java.geometricfigure;/**
 * @author fanYang
 * @create 2021-07-26 14:36
 */

/**
 * @program: OracleStudy
 * @description: 几何图形的子类圆形
 * @author: FanYang
 * @create: 2021-07-26 14:36
 */
public class Circle extends GeometricFigure{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
