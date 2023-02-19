package org.example.Seminar3.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {
    private String name;
    private String author;
    private Integer price;
    private Integer year;
    private Integer pages;

    public boolean isPrime(Integer pages){
        for (int i = 2; i < Math.sqrt(pages); i++) {
            if (pages % i == 0){
                return false;
            }
            return true;
        }
        return true;
    }

}
