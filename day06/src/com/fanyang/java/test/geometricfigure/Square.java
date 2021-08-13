package com.fanyang.java.test.geometricfigure;
/**
 * @author fanYang
 * @create 2021-07-26 14:38
 */

/**
 * @program: OracleStudy
 * @description: 几何图形的方类圆形
 * @author: FanYang
 * @create: 2021-07-26 14:38
 */
public class Square extends GeometricFigure{
    private double length;
    private double width;

    public Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    public void f1(){}
    public void f1(int i,char j){}
    public void f1(char j,int i){}
    public int f1(int i,int j){
        return 0;
    }
}
