package com.damittech.javabasic.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public void createArrayList() {
        //Create Any Type of Array List
        ArrayList arrayList = new ArrayList();
        //Create String Type of ArrayList
        ArrayList<String> stringArrayList = new ArrayList<String>();

        Student student = new Student();
        student.sId = 0001;
        student.sName = "techy";

        //adding any type data to arrayList
        arrayList.add("String");
        arrayList.add(100);
        arrayList.add(2.2);
        arrayList.add(student);

        System.out.println("arrayList : " + arrayList);

        //adding String type of data to stringArrayList
        stringArrayList.add("name");
        stringArrayList.add("age");

        System.out.println("stringArrayList : " + stringArrayList);

        //get data from arrayList
        Object arrayListData = arrayList.get(3);
        System.out.println("arrayListdata : " + arrayListData);

        //get data from stringArrayList
        String stringArrayListData = stringArrayList.get(1);
        System.out.println("stringArrayListdata : " + stringArrayListData);

        //update list data
        stringArrayList.set(0, "address");
        System.out.println("updated stringArrayList : " + stringArrayList);

        //Itarate in arryList
        for(Object obj : arrayList){
            System.out.println("=== : "+obj);
        }

        //Itrate using Itarator
        Iterator<Object> iterator = arrayList.iterator();
        System.out.println("inside Itarator : "+iterator);

        //Itarate usin foreach in arraylist
        arrayList.forEach(obj1 -> System.out.println("Inside foreach: "+obj1));
    }
}
