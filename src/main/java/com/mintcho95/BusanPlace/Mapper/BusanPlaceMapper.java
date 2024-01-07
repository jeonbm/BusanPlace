package com.mintcho95.BusanPlace.Mapper;

import com.mintcho95.BusanPlace.Dto.AttractionDto;
import com.mintcho95.BusanPlace.Entity.AttractionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusanPlaceMapper {
    BusanPlaceMapper INSTANCE = Mappers.getMapper(BusanPlaceMapper.class);

    List<AttractionDto> entityToDto(List<AttractionEntity> entity);
}
