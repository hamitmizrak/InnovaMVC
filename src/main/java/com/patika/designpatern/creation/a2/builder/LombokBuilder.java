package com.patika.designpatern.creation.a2.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public  class LombokBuilder {
    private String adi;
    private String soyadi;

    public static void main(String[] args) {
        LombokBuilder builderTot= LombokBuilder.builder().adi("Adı").soyadi("Soyadı"). build();
    }
}

