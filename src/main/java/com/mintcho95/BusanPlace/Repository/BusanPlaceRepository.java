package com.mintcho95.BusanPlace.Repository;

import com.mintcho95.BusanPlace.Dto.AttractionDto;
import com.mintcho95.BusanPlace.Entity.AttractionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusanPlaceRepository extends JpaRepository<AttractionEntity,Long> {

   @Query(value = "select * from busanattractions where GUGUN_NM=:gu",nativeQuery = true)
   List<AttractionEntity> searchGu(@Param("gu") String _gu);

   @Query(value = "select * from busanattractions where ITEMCNTNTS like %:query%",nativeQuery = true)
   List<AttractionEntity> searchQuery(@Param("query") String _query);


}
