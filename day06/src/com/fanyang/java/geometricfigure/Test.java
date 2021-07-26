package com.fanyang.java.geometricfigure;/**
 * @author fanYang
 * @create 2021-07-26 14:42
 */

/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-26 14:42
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(3, 2);
//        Square square1 = new Square(3, 2);
        System.out.println("圆形的面积和周长如下");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println("方形的面积和周长如下");
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
//        System.out.println(square1.getArea());如果更改对象名称，可以直接使用shift+F6快速更改所有的对象名
//        System.out.println(square1.getPerimeter());
    }
}
