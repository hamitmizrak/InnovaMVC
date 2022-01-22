package com.patika.software.prensible.a1.assosication;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AssosicationMainTest {
    public static void main(String[] args) {
        //Muster >1 fazla
        //Super>1 fazla

        Musteri musteri = Musteri.builder().musteriAdi("Hamit").musteriSehir("Malatya").build();

        SuperMarket superMarket = SuperMarket.builder().superMarketAdi("Xyz44").superMarketSehir("Malatya").build();

        //loose Coupling (Zayıf bağlantı türüne ==> Association diyoruz
        log.info("Müşteri adı " + musteri.getMusteriAdi() + " Süpermarket adi: " + superMarket.getSuperMarketAdi());
    }
}
