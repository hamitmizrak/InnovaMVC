package com.patika.tutorials;

import java.util.UUID;

public class RandomUUIDTest {

    public static void main(String[] args) {
        //32 karakterli şifreleme lazım
        //32 karakterli hexadecimal
        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);
    }


}
