package com.patika.socket.oneway;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

@Log4j2
public class Client {
    public static void main(String[] args) {
        String number;
        String ipAddres = "localhost"; // 127.0.0.1

        int port = 7777; //port
        try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddres, port).getOutputStream())) {
            number = JOptionPane.showInputDialog("lütfen bir sayi giriniz");
            dataOutputStream.writeUTF(number);
        } catch (IOException io) {
            System.out.println("Hata meydana geldi");
            log.error("Hata meydana geldi");
            io.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
