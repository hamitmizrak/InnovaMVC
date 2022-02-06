package com.patika.socket.twoway;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(3000);
        System.out.println("Chat icin server hazır ....");
        Socket socket=serverSocket.accept();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream=socket.getOutputStream();
        PrintWriter printWriter=new PrintWriter(outputStream,true);

        InputStream inputStream=socket.getInputStream();
        BufferedReader receiveRead=new BufferedReader(new InputStreamReader(inputStream));
        String receiveMessage,sendMessage;
        while(true){
            if( (receiveMessage=receiveRead.readLine())!=null){
                System.out.println("CLIENT: "+receiveMessage);
            }
            sendMessage=bufferedReader.readLine();
            printWriter.println(sendMessage);
            printWriter.flush();
        }

    }


}
