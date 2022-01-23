package com.patika.tutorials;

public class StringBuilderTuto {

    public static void main(String[] args) {
        //1.YOL
        String adi="Hamit";
        String soyadi="Mızrak";
        System.out.println(adi+" "+soyadi);

        //2.YOL
        String result="Hamit".concat(" Mızrak");
        System.out.println(result);

        //3.YOL //Servis,Database, karşı taraftan ne geleceğini bilmiyorsam
        // Asenkron: aynı anda birden fazla iş yapabilme yeteneği
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("").append("Hamit").append(" Mızrak").append("");
        String result2=stringBuilder.toString();
        System.out.println(result2);


        //4.YOL güvenli:
        // Senkron: aynı anda sadece bir iş yapabilme yeteneği
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("").append("Hamit").append(" Mızrak").append("");
        String result3=stringBuilder.toString();
        System.out.println(result3);
    }

}
