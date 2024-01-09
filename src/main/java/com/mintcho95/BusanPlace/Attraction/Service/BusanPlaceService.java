package com.mintcho95.BusanPlace.Attraction.Service;

import com.mintcho95.BusanPlace.Attraction.Exception.ErrorCode;
import com.mintcho95.BusanPlace.Attraction.Dto.AttractionDto;
import com.mintcho95.BusanPlace.Attraction.Entity.AttractionEntity;
import com.mintcho95.BusanPlace.Attraction.Exception.ApplicationException;
import com.mintcho95.BusanPlace.Attraction.Mapper.BusanPlaceMapper;
import com.mintcho95.BusanPlace.Attraction.Repository.BusanPlaceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class BusanPlaceService {

    @Autowired
    private BusanPlaceRepository busanPlaceRepository;

    public ResponseEntity<List<AttractionDto>> searchGu(String _gu){
        List<AttractionEntity> village = busanPlaceRepository.searchGu(_gu);
        if(village.size() == 0){
            throw new ApplicationException(ErrorCode.RESULT_EMPTY_ERROR);
        }
        List<AttractionDto> result = BusanPlaceMapper.INSTANCE.entityToDto(village);

        System.out.println("새로운기능이 작동되고 있습니다.");
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

    public ResponseEntity<List<AttractionDto>> searchQuery(String _input){
        List<AttractionEntity> village = busanPlaceRepository.searchQuery(_input);
        if(village.size() == 0){
            throw new ApplicationException(ErrorCode.RESULT_EMPTY_ERROR);
        }
        List<AttractionDto> result = BusanPlaceMapper.INSTANCE.entityToDto(village);

        System.out.println("새로운기능이 작동되고 있습니다.");
        return new ResponseEntity<>(result,HttpStatus.OK);
    }


}
