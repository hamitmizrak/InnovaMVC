package com.patika.designpatern.creation.a5.abstractfactory;

public class MsiAbstractFactory implements  IBilgisayarFabrikasi {
    @Override
    public IBilgisayar getBilgisayar(String computerName) {
        return new Msi("msi");
    }
}
