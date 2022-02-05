package com.patika.tutorials;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterFileReader {
private static final String URL="c:\\patika\\deneme.txt";

    public void patikaFileWriter(){
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(URL,true))) {
            String data= JOptionPane.showInputDialog("Lütfen birşeyler yazınız");
            bufferedWriter.write(data);
            bufferedWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void patikaFileReader(){
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(URL))) {
            String countRow="",sumRow="";
            while(   (countRow=bufferedReader.readLine())!=null   ){
                sumRow+=countRow;
            }
            System.out.println(sumRow);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
