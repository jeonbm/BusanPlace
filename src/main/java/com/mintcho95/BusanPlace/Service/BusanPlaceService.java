package com.mintcho95.BusanPlace.Service;

import com.mintcho95.BusanPlace.Dto.BusanPlaceDto;
import com.mintcho95.BusanPlace.Repository.BusanPlaceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class BusanPlaceService {

    @Autowired
    private BusanPlaceRepository busanPlaceRepository;

    public List<BusanPlaceDto> allVillage(){
        List<BusanPlaceDto> bpd = busanPlaceRepository.findAll();
        return bpd;
    }
}
