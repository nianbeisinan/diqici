package com.hp.collectiondemo;
/**
 * 斗地主  模拟 洗牌
 * 牌数 ：54张   大王  小王  1-k ，四个桃
 * ♦  ♠  ♥  ♣
 * A  B  C  D
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DouDiZhu {
    public static void main(String[] args) {
        //1.先造出四个花色
        List<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");
        //2.造出10个  1-10
        List<String> numbers = new ArrayList<>();
        for (int i = 2; i <= 10 ; i++) {
            numbers.add(i+"");
        }
            numbers.add("J");
            numbers.add("Q");
            numbers.add("K");
            numbers.add("A");
        //System.out.println("numbers = " + numbers);
        //3.上面的 colors  和 number 进行一个整合
        //放入到一个新的集合     如何做到呢？ 嵌套循环
        List<String> piker = new ArrayList<>();
        for (String color : colors){
            for (String number : numbers){
                piker.add(color+number);

            }
        }
        piker.add("Bogking");
        piker.add("lirrleking");
        System.out.println("piker = " + piker);
        System.out.println("piker = " + piker.size());

        //如果使用set 也无法分开排序   有个方法哭打乱他
        //以为set是无序的
        Collections.shuffle(piker);//打断list的排序 斗地主的学名 洗牌
        System.out.println("piker = " + piker);
       // Collections.sort(piker);
        List<String> player1 = new ArrayList<>();//玩家1
        List<String> player2 = new ArrayList<>();//玩家2
        List<String> player3 = new ArrayList<>();//玩家3
        List<String> dipai = new ArrayList<>();
        for (int i = 0; i < piker.size(); i++) {
            String pName=  piker.get(i);//每张扑克牌.
            if (i>=51){
                dipai.add(pName);//埋最后三张的底牌
            }else {
                //玩家1,2,3 发前面51张牌
                if (i%3==0){
                    player1.add(pName);
                }else if (i%3==1){
                    player2.add(pName);
                }else {
                    player3.add(pName);
                }
            }

        }
        System.out.println("dipai = " + dipai);
        System.out.println("player1 = " + player1);
        System.out.println("player1 = " + player1.size());
        System.out.println("player2 = " + player2);
        System.out.println("player2 = " + player2.size());
        System.out.println("player3 = " + player3);
        System.out.println("player3 = " + player3.size());

    }
}
