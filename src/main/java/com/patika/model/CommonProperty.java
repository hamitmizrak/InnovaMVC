package com.patika.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonProperty implements Serializable {
    private static final long serialVersionUID = 5017282997997547888L;

    private int id;
    private Date date;
}
