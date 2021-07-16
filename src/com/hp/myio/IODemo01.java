package com.hp.myio;

import java.io.File;
import java.io.IOException;

/*
* File 文件
*       File 你真行，可读可写可执行
* */
public class IODemo01 {
    public static void main(String[] args) {
        File file=new File("io02.txt");
        System.out.println("file = " + file);
        String name = file.getName();
        System.out.println("name = " + name);
        long length = file.length();
        System.out.println("length = " + length);

        try {
            boolean newFile = file.createNewFile();
            System.out.println("newFile = " + newFile);
        } catch (IOException e) {
            System.out.println("不能创建新文件");
            e.printStackTrace();
        }
    }

}
