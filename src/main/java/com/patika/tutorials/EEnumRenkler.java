package com.patika.tutorials;


import lombok.Getter;
import lombok.Setter;

//type safe
public enum EEnumRenkler {
    MAVI,YESIL,TURUNCU
}


enum Renkler2 {
    MAVI(1,"mavi"),YESIL(2,"yesil"),TURUNCU(3,"turuncu");

    @Getter @Setter
    private final int renkId;

    @Getter @Setter
    private final String renkAdi;

   private Renkler2(int renkId, String renkAdi) {
        this.renkId = renkId;
        this.renkAdi = renkAdi;
    }
}

class Deneme{
    public static void main(String[] args) {
        EEnumRenkler renkler=EEnumRenkler.MAVI;
        System.out.println(renkler);
        String  renkler2=EEnumRenkler.MAVI.toString();
        System.out.println(renkler2.toLowerCase());
        System.out.println("************************");

        String cons=Renkler2.MAVI.getRenkAdi();
        System.out.println(cons);


    }
}
