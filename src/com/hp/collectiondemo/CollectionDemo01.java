package com.hp.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

/*
* 集合 ：非常重要 有一个接口
*
* */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        //ArrayList c1=new ArrayList();
        //add 增加
        c1.add("唐僧");
        c1.add("悟空");
        c1.add("八戒");
        c1.add("沙僧");
        c1.add("白龙马");
        System.out.println("c1 = " + c1);
        //尺寸
        int size=c1.size();
        System.out.println("size = " + size);
        boolean empty=c1.isEmpty();
        System.out.println("empty = " + empty);
        //集合的清空
        //c1.clear();
        System.out.println("c1 = " + c1);
        boolean empty1=c1.isEmpty();
        System.out.println("empty1 = " + empty1);
        //集合遍历 3种
        //1.
        /*for (int i = 0; i < c1.size(); i++) {
            System.out.println("c1 = " + c1.get(i));
        }*/
        //思考题： 为什么 collection 不能使用for循环呢 换句话 为什么不能根据索引来取值呢？
        //因为set集合 没有索引下标  所以 不能使用for循环使用到 collection中
        for (Object o : c1) {
            System.out.println("o = " + o);
        }
        //迭代器  和for循环的区别
        // 迭代器工作 ：
    }
}
