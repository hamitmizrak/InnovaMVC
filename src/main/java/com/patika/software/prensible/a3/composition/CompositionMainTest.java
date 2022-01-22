package com.patika.software.prensible.a3.composition;

import java.util.ArrayList;

public class CompositionMainTest {


    public static void main(String[] args) {
        //tekil olan
        Yazar yazar=new Yazar();
        yazar.setYazarAdi("Anthony");
        yazar.setYazarSoyadi("Robbins");
        yazar.setKitapList(new ArrayList<>()); //null pointer exception

        System.out.println(yazar);

        Kitap kitap=new Kitap();
        kitap.setKitapAdi("Sınırsız Güç");
        kitap.setKitapFiyati("55");
        kitap.setYazar(yazar);
        kitap.getYazar().getKitapList().add(kitap);

        Kitap kitap2=new Kitap();
        kitap2.setKitapAdi("İçindeki Devi Uyandır");
        kitap2.setKitapFiyati("110");
        kitap2.setYazar(yazar);
        kitap2.getYazar().getKitapList().add(kitap2);

        System.out.println(kitap);
        System.out.println(kitap2);




    }
}
