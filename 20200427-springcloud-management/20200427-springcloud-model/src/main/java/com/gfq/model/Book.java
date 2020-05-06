package com.gfq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {
    private Long bookId;
    private String bookName;
    private Double bookPrice;
}
