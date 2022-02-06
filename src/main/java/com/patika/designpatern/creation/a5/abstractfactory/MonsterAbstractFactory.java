package com.patika.designpatern.creation.a5.abstractfactory;

public class MonsterAbstractFactory implements  IBilgisayarFabrikasi {
    @Override
    public IBilgisayar getBilgisayar(String computerName) {

        return new Monster("monster");
    }
}
