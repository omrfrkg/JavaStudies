package com.omrfrkg.javaoopdetails;

public class Kedi {

    String ad;
    String tuyRengi;


    public static String turu = "Felis";

    public static void konusKediStatik(){
        System.out.println("Benim türüm : "+turu);
    }

    public void konusKedi(){
        System.out.println("Benim adım : "+this.ad+" Benim Türüm : "+turu);
    }
}
