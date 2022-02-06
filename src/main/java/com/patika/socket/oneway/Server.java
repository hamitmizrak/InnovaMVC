package com.patika.socket.oneway;

import lombok.extern.log4j.Log4j2;

import java.io.DataInputStream;
import java.net.ServerSocket;

//unutmaa: once server hazır olmalı yani calıstırmalisin
//socket string ilerler
//Object --> String --> primitive
@Log4j2
public class Server {

    public static void main(String[] args) {

        int port = 7777; //port
        String clientValue; //clienttan gelen istekleri alır
        int stringToInteger;
        System.out.println("Server hazir");
        log.info("Server hazir");
        try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
            clientValue = dataInputStream.readUTF();
            stringToInteger = Integer.valueOf(clientValue);
            //clienttan gelen string karekökünü aldım
            System.out.println(stringToInteger + " sayisinin karekoku: " + Math.sqrt(stringToInteger));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
