package org.example.Seminar3.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Products {
    private String name;
    private String manufacturer;
    private Double height;
    private Integer price;
    private Integer grade;

}
