package com.fanyang.java.test;

/**
 * @program: testcode
 * @description: 冒泡排序的具体实现
 * @author: FanYang
 * @create: 2021-07-23 08:42
 */
public class BubbleSort {

    /**
     * @Description: 从小到大排序
     * @Param: [numbers]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/23 8:57
    */
    public static void positiveSort(int[] numbers){
       int lengths = numbers.length;
       int temp = 0;
        for (int i = 1;i<lengths;i++){
            for (int j =0;j<lengths-i;j++){
                if (numbers[j] >numbers[j+1]){
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    }

    /**
     * @Description: 从大到小排序
     * @Param: [args]
     * @return: void
     * @author: FanYang
     * @time: 2021/7/23 8:58
    */
    public static void reverseSort(int[] numbers){
        int length = numbers.length;
        int temp = 0;
        for (int i=0;i<length-1;i++){
            for (int j=0;j<length-i-1;j++){
                if (numbers[j]<numbers[j+1]){
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort.positiveSort(new int[]{5,6,1,4,9});
        BubbleSort.reverseSort(new int[]{5,6,1,4,9});
    }
}
