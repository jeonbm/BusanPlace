package com.mintcho95.BusanPlace.Attraction.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
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

    @JsonProperty("HOMEPAGE_URL")
    private String homepage_url;

    @JsonProperty("TRFC_INFO")
    private String trfc_info;

    @JsonProperty("USAGE_DAY")
    private String usage_day;

    @JsonProperty("HLDY_INFO")
    private String HLDY_INFO;

    @JsonProperty("USAGE_DAY_WEEK_AND_TIME")
    private String usage_day_week_and_time;

    @JsonProperty("USAGE_AMONT")
    private String usage_amount;

    @JsonProperty("MIDDLE_SIZE_RM1")
    private String middle_size_rm1;

    @JsonProperty("MAIN_IMG_NORMAL")
    private String main_img_normal;

    @JsonProperty("MAIN_IMG_THUMB")
    private String main_img_thumb;

    @JsonProperty("ITEMCNTNTS")
    private String itemcntnts;

    @JsonProperty("writeDate")
    private String writeDate;




}
