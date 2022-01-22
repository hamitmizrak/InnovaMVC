package com.patika.software.prensible.a1.assosication;

//Association sınıflar arasındaki bağlantının zayıf biçimine verilen addır.
//super market 1 müşteri olmadan da ayakta durur.

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class SuperMarket {
    private String superMarketAdi;
    private String superMarketSehir;
}
