package com.zayyni.sprinboot2restoutputmediatype.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    private Integer id;
    private Double cost;
    private String color;

    private Vendor vob;
}
