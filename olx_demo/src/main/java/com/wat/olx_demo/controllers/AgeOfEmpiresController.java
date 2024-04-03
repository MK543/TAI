package com.wat.olx_demo.controllers;

import com.wat.olx_demo.clients.AgeOfEmpiresAPIClient;
import com.wat.olx_demo.clients.AgeOfEmpiresAPIClientImpl;
import com.wat.olx_demo.dtos.CivDto;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aoe")
public class AgeOfEmpiresController {

    private final AgeOfEmpiresAPIClientImpl ageOfEmpiresAPIClient;

    public AgeOfEmpiresController(AgeOfEmpiresAPIClientImpl ageOfEmpiresAPIClient) {
        this.ageOfEmpiresAPIClient = ageOfEmpiresAPIClient;
    }

    @GetMapping("/all")
    public List<CivDto> getAllCivs(){
        return ageOfEmpiresAPIClient.getClient().findAll(false, false, false);
    }
}
