package com.zayyni.sprinboot2restoutputmediatype.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer pCode;
    private String pName;

    private Model model;
}
