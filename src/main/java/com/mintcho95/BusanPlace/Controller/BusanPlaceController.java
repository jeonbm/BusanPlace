package com.mintcho95.BusanPlace.Controller;

import com.mintcho95.BusanPlace.Dto.AttractionDto;
import com.mintcho95.BusanPlace.Dto.QueryDto;
import com.mintcho95.BusanPlace.Service.BusanPlaceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/BusanPlace")
@RestController
public class BusanPlaceController {

    @Autowired
    private BusanPlaceService busanPlaceService;

    @PostMapping("/Search/Gu")
    public ResponseEntity<List<AttractionDto>> BusamPlaceSearch(@Valid  @RequestBody QueryDto _input){
        System.out.println("입력받은 지역구 : "+_input.getQuery());
        ResponseEntity<List<AttractionDto>> result = busanPlaceService.searchGu(_input.getQuery());
        return result;
    }

    @PostMapping("/Search/Query")
    public ResponseEntity<List<AttractionDto>> Query(@Valid @RequestBody QueryDto _input){
        System.out.println("입력받은 검색어 : "+_input.getQuery());
        ResponseEntity<List<AttractionDto>> result = busanPlaceService.searchQuery(_input.getQuery());
        return result;
    }


}
