package com.hp.collectiondemo;

public class Person implements Comparable<Person>{
    private String name;
    private  int height;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
//实现的接口是，比较接口，一个一个的比较
    @Override
    public int compareTo(Person o) {
        //目前，按身高排序
        //如果return的返回值，大于0就是自身大于被比较对象
        int x=this.getHeight()-o.getHeight();

        return x;
    }


}
