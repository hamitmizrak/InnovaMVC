package com.patika.designpatern.creation.a4.factory;

public class FactoryMainTest {

    public static void main(String[] args) {
        IBilgisayar msi = BilgisayarFabrikasi.getBilgisayar("msi");
        System.out.println(msi.getComputerName());

        IBilgisayar monster = BilgisayarFabrikasi.getBilgisayar("monster");
        System.out.println(monster.getComputerName());

    }
}
