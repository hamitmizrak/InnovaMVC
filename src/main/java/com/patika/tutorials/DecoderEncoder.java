package com.patika.tutorials;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class DecoderEncoder {

    //Klavyeden veri almak için kullanıyoruz
    public  String getScannerMethod(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen şifrelenecek kelime giriniz");
        return klavye.nextLine();
    }

    //Encoder: şifreleme
    public  String getEncoderMethod(String data){
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    //Decoder
    public  void getDecoderMethod(String data){
        String sifreCoz=new String(Base64.getMimeDecoder().decode(data));
        System.out.println(sifreCoz);
    }

    public static void main(String[] args) {
       DecoderEncoder decoderEncoder=new DecoderEncoder();
//  String kelime=decoderEncoder.getScannerMethod();
//  System.out.println(decoderEncoder.getEncoderMethod(kelime));
       decoderEncoder.getDecoderMethod(decoderEncoder.getEncoderMethod(decoderEncoder.getScannerMethod()));
    }

}
