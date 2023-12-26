package com.mintcho95.BusanPlace.Controller;

import com.mintcho95.BusanPlace.Entity.BusanPlaceEntity;
import com.mintcho95.BusanPlace.Service.BusanPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/v1/BusanPlace")
@RestController
public class BusanPlaceController {

    @Autowired
    private BusanPlaceService busanPlaceService;

    @GetMapping("/AllVillage")
    public List<BusanPlaceEntity> BusanPlace(){

        List<BusanPlaceEntity> result = busanPlaceService.allVillage();
        System.out.println("size : "+result.size());
        return result;
    }

    @GetMapping("/Search/Gu")
    public List<BusanPlaceEntity> BunamPlaceSearch(){
        List<BusanPlaceEntity> result = busanPlaceService.searchGu("금정구");
        //System.out.println("size : "+result);
        return result;
    }

}
