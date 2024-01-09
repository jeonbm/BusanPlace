package com.mintcho95.BusanPlace.Like.Repository;


import com.mintcho95.BusanPlace.Like.Controller.LikeDto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LikeRepository extends JpaRepository<LikeDto,String> {


    @Transactional
    @Modifying
    @Query(value = "insert into attractionliketb(UC_SEQ,userIdx,writeDate) values (:cId,:userId,now())",nativeQuery = true)
    void insertLike(@Param("cId") String _cId,@Param("userId")String _userId);

}
