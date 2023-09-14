package com.omrfrkg.javaogreniyorum;

import android.widget.Switch;

public class Operatorler {

    public static void main(String[] args){


        int x = 5;
        System.out.println(x);

        x = x + 1;
        System.out.println(x);

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);

        x = x * 5 ;
        System.out.println(x);

        int y = 3;
        System.out.println(y>x);
        System.out.println(y>=x);
        System.out.println(y==x);
        System.out.println(y!=x);
        System.out.println(y!=x && y<x);
        System.out.println(y!=x || y<x);

        //if

        if (y < x){
            System.out.println("X daha büyük");
        }

        //Switch

        int day = 1;
        String dayString = "";

        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Sunday";
                break;
        }

        System.out.println(dayString);







    }
}
