package com.omrfrkg.javaogreniyorum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Diziler {

    public static void main(String[] args){

        //Diziler

        String[] myStringArray = new String[3];

        myStringArray[0] = "Ömer";
        myStringArray[1] = "Ahmet";
        myStringArray[2] = "Mehmet";

        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 20;
        myIntegerArray[1] = 30;
        myIntegerArray[2] = 40;

        System.out.println(myStringArray[0]+" "+myIntegerArray[0]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8};

        System.out.println(myNumberArray[0]);

        //Listeler

        ArrayList<String> myMusicians = new ArrayList<String>();

        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add("Rob");
        //1.İndex numarasına ekleme yapmak istersem
        myMusicians.add(1,"Kirk");

        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.size());

        //Set

        HashSet<String> mySet = new HashSet<String>();
        mySet.add("Ömer");
        mySet.add("Ömer");

        System.out.println(mySet.size());

        //HashMap

        //Key Value Mantığı İle Çalışır

        HashMap<String,String> myHashMap = new HashMap<String,String>();

        myHashMap.put("name","James");
        myHashMap.put("instrument","Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));


        HashMap<String,Integer> mySecondMap = new HashMap();

        mySecondMap.put("run",100);
        mySecondMap.put("basketbol",200);

        System.out.println(mySecondMap.get("run"));











    }
}
