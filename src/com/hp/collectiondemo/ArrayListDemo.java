package com.hp.collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * JDK 8 的 快速去集合中的属性
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Person diaoChan = new Person();
                diaoChan.setAge(18);
                diaoChan.setHeight(167);
                diaoChan.setName("貂蝉");

        Person xiaoqiao = new Person();
        xiaoqiao.setAge(19);
        xiaoqiao.setHeight(140);
        xiaoqiao.setName("小乔");

        Person sunshangxiang = new Person();
        sunshangxiang.setAge(22);
        sunshangxiang.setHeight(170);
        sunshangxiang.setName("孙尚香");
        //需求：给定一个list person对象的集合，需要一个String 集合，该集合中的值是提取与还是那个么3000个  list的值  把美女的名字都存进去

        List<Person> list = new ArrayList();
        list.add(diaoChan);
        list.add(xiaoqiao);
        list.add(sunshangxiang);
        System.out.println("list = " + list);

        List<String> names = new ArrayList<>();
        //list.add(diaoChan.getName());
       // list.add(xiaoqiao.getName());
        //list.add(sunshangxiang.getName());
       // System.out.println("names = " + names);

        //List<String> names = new ArrayList<>();
        //1. 遍历  list 集合  ， 拿出对象的name 付给 新的 names 集合中
       // for (Person s : list){
         //   String name = s.getName(); //2.赋值给新的集合
           // names.add(name);

        //}
        //System.out.println("names = " + names);

        //以上是传统的，新的呢？JDK8 Stream(), 作业1：自我学习 JDK8的新特性，如何新的遍历

    List<String> nameList = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameList = " + nameList);


    }


}
