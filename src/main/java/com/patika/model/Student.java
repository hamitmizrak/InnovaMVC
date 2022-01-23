package com.patika.model;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
public class Student {

    private String adi;
    private String soyadi;

    public Student() {
    }

    public Student(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }
}
