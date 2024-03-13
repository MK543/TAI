package com.wat.olx_demo.services;

import com.wat.olx_demo.dtos.OfferRequestDto;
import com.wat.olx_demo.dtos.OfferResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService{

    @Override
    public void save(OfferRequestDto offerRequestDto) {

    }

    @Override
    public List<OfferResponseDto> getAll() {
        return List.of(
                new OfferResponseDto(1, "test", "/123"),
                new OfferResponseDto(2, "test", "/123"),
                new OfferResponseDto(3, "test", "/123")
        );
    }

    @Override
    public OfferResponseDto getById(int id) {
        return new OfferResponseDto(1, "test", "/123");
    }
}
