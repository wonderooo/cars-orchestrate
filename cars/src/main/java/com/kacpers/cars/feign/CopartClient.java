package com.kacpers.cars.feign;

import com.kacpers.cars.feign.request.LotSearchRequest;
import com.kacpers.cars.feign.response.LotDetailsResponse;
import com.kacpers.cars.feign.response.LotImagesResponse;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "copart", url = "https://www.copart.ca", configuration = CopartConfig.class)
public interface CopartClient {
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            consumes = "application/json",
            produces = "application/json"
    )
    ResponseEntity<String> fetchCookies();

    @RequestMapping(
            value = "/public/lots/search-results",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json"
    )
    ResponseEntity<String> search(@RequestBody LotSearchRequest request, @RequestHeader("Cookie") String cookies);

    @RequestMapping(
            value = "/public/data/lotdetails/solr/{lotNumber}",
            method = RequestMethod.GET,
            consumes = "application/json",
            produces = "application/json"
    )
    ResponseEntity<LotDetailsResponse> details(@PathVariable Long lotNumber, @RequestHeader("Cookie") String cookies);

    @RequestMapping(
            value = "/public/data/lotdetails/solr/lotImages/{lotNumber}",
            method = RequestMethod.GET,
            consumes = "application/json",
            produces = "application/json"
    )
    ResponseEntity<LotImagesResponse> images(@PathVariable Long lotNumber, @RequestHeader("Cookie") String cookies);
}
