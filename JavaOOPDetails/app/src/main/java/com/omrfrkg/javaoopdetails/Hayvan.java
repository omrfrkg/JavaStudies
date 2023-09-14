package com.omrfrkg.javaoopdetails;

public class Hayvan {
    String isim;
    String gozRengi;
    String tuyRengi;

    public Hayvan(){
        //Object'den alıyor
        super();
    }

    public Hayvan(String isim, String gozRengi, String tuyRengi) {
        this.isim = isim;
        this.gozRengi = gozRengi;
        this.tuyRengi = tuyRengi;
    }
}
