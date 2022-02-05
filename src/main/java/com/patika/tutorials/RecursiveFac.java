package com.patika.tutorials;

public class RecursiveFac {
   // 4!=4.3.2.1
    public static int factoriyel(int sayi){
        if(sayi==1){
            return 1;
        }   else {
            return sayi*factoriyel(sayi-1);
        }
    }

}
