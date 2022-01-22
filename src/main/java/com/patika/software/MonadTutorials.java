package com.patika.software;

import lombok.extern.log4j.Log4j2;

import java.util.Locale;

//Monad
@Log4j2
public class MonadTutorials {
    // Data olsun bu datayı büyük harfler ile olsun

    //1.method
    public static String getValue(String data) {
        return data;
    }

    //2.method
    public static String getResult(String data) {
        return data.toUpperCase();
    }

    //monad: bir metodun çıktısı diğer metodun girdisine denir.
    public static void main(String[] args) {
        String monad = getResult(getValue("Malatya"));
        log.info(monad);
    }

}
