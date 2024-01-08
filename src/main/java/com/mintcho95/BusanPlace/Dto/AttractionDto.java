package com.mintcho95.BusanPlace.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class AttractionDto {

    // 명소 컨텐츠번호
    @JsonProperty("UC_SEQ")
    private String UC_SEQ;

    // 제목
    @JsonProperty("MAIN_TITLE")
    private String MAIN_TITLE;

    @JsonProperty("PLCAE")
    private String place;

    @JsonProperty("ITEMCNTNTS")
    private String itemcntnts;

    @JsonProperty("writeDate")
    private String writeDate;

    // 지역구 코드
    @JsonProperty("GUGUN_NM")
    private String gugun_nm;

    // 카테고리
    @JsonProperty("CATE2_NM")
    private String cate2_nm;

    // 위도
    @JsonProperty("LAT")
    private String lat;

    // 경도
    @JsonProperty("LNG")
    private String lng;


    // 본제목
    @JsonProperty("TITLE")
    private String title;

    // 부제목
    @JsonProperty("SUB_TITLE")
    private String sub_title;

    // ??
    @JsonProperty("MAIN_PLACE")
    private String main_place;

    // 본 주소
    @JsonProperty("ADDR1")
    private String addr1;

    // 부 주소
    @JsonProperty("ADDR2")
    private String addr2;

    // 연락처
    @JsonProperty("CNTCT_TEL")
    private String cntct_tel;



}
