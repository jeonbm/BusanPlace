package com.mintcho95.BusanPlace.Controller;

import com.mintcho95.BusanPlace.Dto.BusanPlaceDto;
import com.mintcho95.BusanPlace.Service.BusanPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/v1")
@RestController
public class BusanPlaceController {

    @Autowired
    private BusanPlaceService busanPlaceService;

    @GetMapping("/BusanPlace")
    public List<BusanPlaceDto> BusanPlace(){

        List<BusanPlaceDto> result = busanPlaceService.allVillage();
        System.out.println("size : "+result.size());
        return result;
    }

}
