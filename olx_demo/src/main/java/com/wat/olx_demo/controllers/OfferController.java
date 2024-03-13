package com.wat.olx_demo.controllers;
import com.wat.olx_demo.dtos.OfferRequestDto;
import com.wat.olx_demo.dtos.OfferResponseDto;
import com.wat.olx_demo.services.OfferService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("offers")
public class OfferController {

    private final OfferService offerService;

    @PostMapping("/save")
    public void save(@RequestBody OfferRequestDto requestDto){
        offerService.save(requestDto);
    }

    @GetMapping("/{id}" )
    public OfferResponseDto getOfferById(@PathVariable int id){
       return offerService.getById(1);
    }

    //    @GetMapping("" )
    //    public OfferResponseDto getOfferByX(@RequestParam("x") int x){
    //        return new OfferResponseDto(1, "test", "/123");
    //    }

    @GetMapping("/all")
    public List<OfferResponseDto> getAllOffers(){
        return offerService.getAll();
    }
}
