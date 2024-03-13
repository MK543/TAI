package com.wat.olx_demo.services;

import com.wat.olx_demo.dtos.OfferRequestDto;
import com.wat.olx_demo.dtos.OfferResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OfferService {

    void save (OfferRequestDto offerRequestDto);

    List<OfferResponseDto> getAll();

    OfferResponseDto getById(int id);

}
