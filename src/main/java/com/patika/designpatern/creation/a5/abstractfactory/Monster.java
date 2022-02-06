package com.patika.designpatern.creation.a5.abstractfactory;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class Monster implements IBilgisayar {

    private String computerName;


    @Override
    public String getComputerName() {
        return "monster";
    }



}