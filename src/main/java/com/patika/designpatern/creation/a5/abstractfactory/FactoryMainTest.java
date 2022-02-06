package com.patika.designpatern.creation.a5.abstractfactory;

public class FactoryMainTest {

    public static void main(String[] args) {
        MsiAbstractFactory msiAbstractFactory=new MsiAbstractFactory();
        IBilgisayar iBilgisayar1=msiAbstractFactory.getBilgisayar("msi");
        System.out.println(iBilgisayar1);


    }
}
