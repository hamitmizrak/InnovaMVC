package com.patika.designpatern.creation.a4.factory;

public class BilgisayarFabrikasi {

    public static IBilgisayar getBilgisayar(String computerName){
        if("msi".equalsIgnoreCase(computerName)){
            return new Msi();
        }else if("monster".equalsIgnoreCase(computerName)){
            return new Monster();
        } else{
            throw new RuntimeException("Bilgisayar yoktur...");
        }

    }
}
