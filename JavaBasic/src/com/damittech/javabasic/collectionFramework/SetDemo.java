package com.damittech.javabasic.collectionFramework;

import java.util.HashSet;

/**
 * @author DAMITH SAMARAKOON on 5/25/2020
 */
public class SetDemo {
    HashSet<String> hashSet = new HashSet<String>();

    public void createSet(){
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("b");


        //Data is unique.no duplicate
        //Data is unorderd. due to hashing
        System.out.println("hashset : "+hashSet);
    }
}
