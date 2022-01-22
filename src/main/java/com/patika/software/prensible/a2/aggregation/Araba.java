package com.patika.software.prensible.a2.aggregation;

//Araba motora bağlıdır.
//Araba bağımlı


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
public class Araba {


    private Motor motor;

    public double getToplamFiyat() {
        motor = new Motor();
        double toplam = motor.getMotorFiyati() + 2000;
        return toplam;
    }
}
