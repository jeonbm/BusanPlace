package com.mintcho95.BusanPlace.Service;

import com.mintcho95.BusanPlace.Attraction.Service.BusanPlaceService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
public class AllVillageTest {

    @Autowired
    private BusanPlaceService busanPlaceService;

    @Test
    void AllVillage(){
        //List<BusanPlaceEntity> result = busanPlaceService.searchGu("연제구");
        //assertThat(result.size()).isEqualTo(2);

    }

    @Test
    void SearchGu(){
        List<BusanPlaceEntity> result = busanPlaceService.allVillage();
        assertThat(result.size()).isEqualTo(40);
    }


}


