package com.omrfrkg.javaogreniyorum;

public class Donguler {

    public static void main(String[] args){

        //for Döngüsü

        int[] myNumbers = {1,2,3,4,5,6,7,8,9};


        for (int i=0;i<myNumbers.length;i++){
            int x = myNumbers[i]*3/6;
            System.out.println(x);
        }

        for (int number : myNumbers){
            System.out.println(number*3/6);
        }

        //While Döngüsü

        int j =0;
        while(j<10){
            System.out.println("test");
            j++;
        }


    }
}
