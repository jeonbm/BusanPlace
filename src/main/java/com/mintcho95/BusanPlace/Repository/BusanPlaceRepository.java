package com.mintcho95.BusanPlace.Repository;

import com.mintcho95.BusanPlace.Dto.BusanPlaceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusanPlaceRepository extends JpaRepository<BusanPlaceDto,Long> {

}
