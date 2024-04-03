package com.wat.olx_demo.clients;

import com.wat.olx_demo.dtos.CivDto;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface AgeOfEmpiresAPIClient {
    @RequestLine("GET /civs?includeUnits={includeUnits}&includeTechs={includeTechs}&includeBuildings={includeBuildings}")
    List<CivDto> findAll(@Param("includeUnits") boolean includeUnits,
                         @Param("includeTechs") boolean includeTechs,
                         @Param("includeBuildings") boolean includeBuildings);
}
