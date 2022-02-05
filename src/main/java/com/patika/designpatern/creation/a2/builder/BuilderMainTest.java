package com.patika.designpatern.creation.a2.builder;

public class BuilderMainTest {
    public static void main(String[] args) {
        StudentBuilder builder=new StudentBuilder.Builder().adi("Adi44").soyadi("Soyadi44").build();
        System.out.println(builder.getAdi()+" "+builder.getSoyadi());
    }
}
