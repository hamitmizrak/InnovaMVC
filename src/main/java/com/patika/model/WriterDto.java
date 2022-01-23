package com.patika.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Builder
@Getter @Setter
@ToString
public class WriterDto extends CommonProperty {
    private static final long serialVersionUID = 196002168160758766L;

    private String writerName;
    private String writerSurname;
    private String writerAddress;
    private double writerTelephoneNumber;

    //parametresiz constructor
    public WriterDto() {
        //super.setDate(new Date(System.currentTimeMillis()));
    }

    //parametreli constructor
    public WriterDto(int id, Date date, String writerName, String writerSurname, String writerAddress, double writerTelephoneNumber) {
        super(id, date);
        this.writerName = writerName;
        this.writerSurname = writerSurname;
        this.writerAddress = writerAddress;
        this.writerTelephoneNumber = writerTelephoneNumber;
    }

    //parametreli constructor
    public WriterDto(String writerName, String writerSurname, String writerAddress, double writerTelephoneNumber) {
        this.writerName = writerName;
        this.writerSurname = writerSurname;
        this.writerAddress = writerAddress;
        this.writerTelephoneNumber = writerTelephoneNumber;
    }
}
