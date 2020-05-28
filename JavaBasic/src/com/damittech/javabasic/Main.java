package com.damittech.javabasic;

import com.damittech.javabasic.algorithm.ReverseInteger;
import com.damittech.javabasic.collectionFramework.ListDemo;
import com.damittech.javabasic.collectionFramework.SetDemo;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

//        ReverseString reverseString = new ReverseString();
//        System.out.println(reverseString.reverseString("HelloWorld"));

//        ListDemo listDemo = new ListDemo();
//        listDemo.createArrayList();

//        SetDemo setDemo= new SetDemo();
//        setDemo.createSet();

        ReverseInteger reverseInteger= new ReverseInteger();
        reverseInteger.reverse(1234);
    }
}
