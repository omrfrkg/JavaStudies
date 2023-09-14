package com.omrfrkg.landmarkbookjava;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String country;
    String details;
    int pic;

    public Landmark(String name,String country,String details,int pic){
        this.name = name;
        this.country = country;
        this.details = details;
        this.pic = pic;
    }
}
