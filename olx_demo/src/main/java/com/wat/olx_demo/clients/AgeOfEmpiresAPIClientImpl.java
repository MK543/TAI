package com.wat.olx_demo.clients;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.stereotype.Service;

@Service
public class AgeOfEmpiresAPIClientImpl {

public AgeOfEmpiresAPIClient getClient(){
    return Feign.builder()
            .client(new OkHttpClient())
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .logger(new Slf4jLogger(AgeOfEmpiresAPIClient.class))
            .logLevel(Logger.Level.FULL)
            .target(AgeOfEmpiresAPIClient.class, "https://aoe2-data-api.herokuapp.com");
}

}
