package com.omrfrkg.javaogreniyorum;

public class Degisken {

    //Program Başlangıcında İlk Bu Çalıştırılacak
    public static void main(String[] args){

        //Değişkenler

        //Integer - Long
        int age = 20;
        int number = 6;

        System.out.println(age/number);

        long myLong = 5;
        System.out.println(myLong/2);

        //Double - Float

        double a = 11.4;
        double b = 2.3;

        float c = 22.3f;

        System.out.println(c);
        System.out.println(a/b);


        double pi = 3.14;
        int r = 5;

        System.out.println(2*pi*r);

        //String

        String name = "Ömer Faruk";
        String surname = "Gündoğdu";

        System.out.println(name+" "+surname);

        //Boolean

        boolean isAlive = true;
        isAlive = false;

        System.out.println(isAlive);

        //Final

        //Eğer ki değişkenimin değeri değişmesin istiyorsam final değişken tipini kullanırız.
        final int myInteger = 5;

        System.out.println(myInteger);

    }
}
