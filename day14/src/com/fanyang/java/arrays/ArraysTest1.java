package com.fanyang.java.arrays;

import org.junit.Test;

import java.util.Arrays;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-04 09:12
 */
public class ArraysTest1 {
    /*
     * @Description: 打印数组内部的元素
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 9:32
     */
    @Test
    public void test1() {
        int[] arr = {1, 7, 9, 3, 5};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * @Description: sort方法的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 9:32
     */
    @Test
    public void test2() {
        int[] arr = {1, 7, 9, 3, 5};
//        Arrays.sort(arr);//全部从低到高排序
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, 0, 4);//指定排序的起始和终点位置，部分排序，遵循java的左闭右开原则
        System.out.println(Arrays.toString(arr));

    }

    /*
     * @Description: 二分查找的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 9:31
     */
    @Test
    public void test3() {
        int[] arr = {1, 7, 9, 3, 5};
//        Arrays.sort(arr);//全部从低到高排序
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 5));//如果传入的数组无序则返回负数索引值】
        System.out.println(Arrays.binarySearch(arr, 0, 3, 9));//如果传入的数组索引值范围内有序，且有查找的这个值，则可以有正确的索引返回值
    }

    /*
     * @Description: copyOf复制数组内的元素
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 9:33
     */
    @Test
    public void test4() {
        int[] arr = {1, 7, 9, 3, 5};
        int[] arr1 = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Arrays.copyOf(arr, 6);//如果新建数组的长度大于复制的数组长度则多余的部分，会对应数据类型的默认初始值，比如int类型为0
        System.out.println(Arrays.toString(arr2));
    }

    /*
     * @Description: copyOfRange指定索引值复制数组内的元素
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 9:39
     */
    @Test
    public void test5() {
        int[] arr = {1, 7, 9, 3, 5};
        int[] arr1 = Arrays.copyOfRange(arr, 1, 4);//复制指定索引值范围内的值
        System.out.println(Arrays.toString(arr1));
    }

    /*
     * @Description: equals比较数组元素的值是否相等
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 9:42
     */
    @Test
    public void test6() {
        int[] arr = {1, 7, 9, 3, 5};
        int[] arr1 = {1, 7, 9, 3, 5};
        int[] arr2 = {1, 7, 9, 3, 8};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr, arr1));
    }

    /*
     * @Description: Arrays数组的equals方法和deepEquals方法的比较
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 10:09
    */
    @Test
    public void test7(){
        String[][] name1 = {{ "G","a","o" },{ "H","u","a","n"},{ "j","i","e"}};
        String[][] name2 = {{ "G","a","o" },{ "H","u","a","n"},{ "j","i","e"}};
        System.out.println(Arrays.equals(name1, name2));    // false
        System.out.println(Arrays.deepEquals(name1, name2));// true
        String[] name3 = {"G","a","o","H","u","a","n","j","i","e"};
        String[] name4 = {"G","a","o","H","u","a","n","j","i","e"};
        System.out.println(Arrays.equals(name3, name4));      // true
        System.out.println(Arrays.deepEquals(name3, name4));  // true
    }

    /*
     * @Description: 通过fill方法指定填充值然后填充数组
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 9:58
    */
    @Test
    public void test8() {
        int[] arr = {1, 7, 9, 3, 5};
        int[] arr1 = {1, 7, 9, 3, 5};
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,2);
        Arrays.fill(arr1,1,5,2);//指定填充的索引范围
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }


}
