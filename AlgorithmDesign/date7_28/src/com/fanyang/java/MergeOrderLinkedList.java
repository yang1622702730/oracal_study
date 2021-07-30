package com.fanyang.java;

/**
 * @program: AlgorithmDesign
 * @description:将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 * @author: FanYang
 * @create: 2021-07-28 23:11
 */
public class MergeOrderLinkedList {
    public int[] solutions(int[] int1, int[] int2) {
        int len1 = int1.length;
        int len2 = int2.length;
        int insert = 0;
        for (int i = 0; i < len1; i++) {
            for (int j = insert; j < len2; j++) {

            }
        }
        return null;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
