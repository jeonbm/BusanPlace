package com.mintcho95.BusanPlace.Like.Controller;

import com.mintcho95.BusanPlace.Attraction.Entity.AttractionEntity;
import com.mintcho95.BusanPlace.Jwt.Util.SecurityUtil;
import com.mintcho95.BusanPlace.Like.Repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class LikeController {

    // 서비스에서 구현을 해야하는데 임시 테스트

    @Autowired
    private LikeRepository likeRepository;

    @GetMapping("/asd/{cid}")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public void asd(@PathVariable("cid")String _cid){
        System.out.println("호출되었습니다.");
       //likeRepository.insertLike("1027","user123");

        Optional<String> ret = SecurityUtil.getCurrentUsername();
        String UserID = ret.get();
        System.out.println("로그인된 ID : "+UserID);

        

        likeRepository.insertLike(_cid,UserID);
    }

    @GetMapping("/test/api")
    public List<String> test(){

        List<String> arr = new ArrayList<>();

        for(int i = 0;i<10;i++) {
            arr.add("안녕"+i);
        }

        return arr;
    }
}
