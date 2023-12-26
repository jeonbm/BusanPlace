package com.mintcho95.BusanPlace.Service;

import com.mintcho95.BusanPlace.Entity.BusanPlaceEntity;
import com.mintcho95.BusanPlace.Repository.BusanPlaceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class BusanPlaceService {

    @Autowired
    private BusanPlaceRepository busanPlaceRepository;

    public List<BusanPlaceEntity> allVillage(){
        List<BusanPlaceEntity> result = busanPlaceRepository.findAll();
        return result;
    }

    public List<BusanPlaceEntity> searchGu(String _gu){
        List<BusanPlaceEntity> result = busanPlaceRepository.searchGu(_gu);
        return result;
    }
}
