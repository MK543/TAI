package com.wat.olx_demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OfferResponseDto {

    private int id;

    private String description;

    private String photoLink;

}
