package com.mintcho95.BusanPlace.Repository;

import com.mintcho95.BusanPlace.Entity.BusanPlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BusanPlaceRepository extends JpaRepository<BusanPlaceEntity,Long> {

   List<BusanPlaceEntity> findAllByGu(String _gu);

   //@Query("select u from {table명이 아닌 엔티티명} u where u.gu=:gu")
   //@Query("select u from BusanPlaceEntity u where u.gu=:gu")

   @Query(value = "select * from busanCity where gu=:gu",nativeQuery = true)
   List<BusanPlaceEntity> searchGu(@Param("gu") String _gu);

}
