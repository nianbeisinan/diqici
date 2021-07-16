package com.hp.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 他只能对list排序，对set不可以，因为set是无序的
 * 排序集合  对集合进行自然排序（从小到大）
* 
* */
public class SortListDemo01 {
    public static void main(String[] args) {
        //纯数字
      /*  List<Integer> list=new ArrayList<>();
        list.add(50);
        list.add(30);
        list.add(60);
        list.add(20);
        list.add(10);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);*/
      //纯字符串
        List<String> list1=new ArrayList<>();
        list1.add("卢光辉");
        list1.add("宁静静");
        list1.add("郭旭");
        list1.add("悟空");
        list1.add("八戒");
        System.out.println("list = " + list1);
        Collections.sort(list1);
        System.out.println("list = " + list1);
        //对象的排序(应用的地方很广) 对对象的属性排序
        Person p1 = new Person();
        p1.setName("貂蝉");
        p1.setHeight(160);
        p1.setAge(16);
        Person p2 = new Person();
        p2.setName("武大");
        p2.setHeight(150);
        p2.setAge(22);
        Person p3 =new Person();
        p3.setName("诸葛亮");
        p3.setHeight(170);
        p3.setAge(56);
        Person p4 =new Person();
        p4.setName("周瑜");
        p4.setHeight(169);
        p4.setAge(35);
        Person p5 =new Person();
        p5.setName("曹操");
        p5.setHeight(190);
        p5.setAge(45);
        List<Person> personList=new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        System.out.println("personList = " + personList);
        Collections.sort(personList);
        System.out.println("personList = " + personList);
    //练习：按年龄 从大到小排序
        //作业1：按照person的名字的长度排序
        //Collections.reverse()反转
    }
}
