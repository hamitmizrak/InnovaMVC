package com.patika.socket.twoway;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",3000);
        BufferedReader bufferedReader1=new BufferedReader(new InputStreamReader(System.in));

        OutputStream outputStream=socket.getOutputStream();
        PrintWriter printWriter=new PrintWriter(outputStream,true);

        InputStream inputStream=socket.getInputStream();
        BufferedReader bufferedReader2=new BufferedReader(new InputStreamReader(inputStream));

        System.out.println("Client: Lutfen mesaj yazınız");

        String receiveMessage,sendMessage;
        while(true){
            sendMessage=bufferedReader1.readLine();
            printWriter.println(sendMessage);
            printWriter.flush();

            if( (receiveMessage=bufferedReader2.readLine()) !=null){
                System.out.println("SERVER: "+receiveMessage);
            }
        }
    }

}
