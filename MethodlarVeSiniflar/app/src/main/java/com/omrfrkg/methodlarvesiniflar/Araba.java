package com.omrfrkg.methodlarvesiniflar;

public class Araba {

    //Default olarak public şeklinde geliyor
    //Protected olarak kullanırsak kalıtım yoksa erişime izin verilmez.
    String marka;
    int model;
    String renk;
    private int seriNumarasi;
    public Araba(String marka,int model,String renk){
        this.marka = marka;
        this.model = model;
        this.renk = renk;
    }

    public int getSeriNumarasi(){
        return seriNumarasi;
    }

    public void setSeriNumarasi(int seriNumarasi){
        this.seriNumarasi = seriNumarasi;
    }
}
