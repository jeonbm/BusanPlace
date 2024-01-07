package com.mintcho95.BusanPlace.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name="busanattractions")
@NoArgsConstructor
@Getter
public class AttractionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UC_SEQ")
    private String UC_SEQ;

    @Column(name="MAIN_TITLE")
    private String MAIN_TITLE;

    @Column(name="GUGUN_NM")
    private String gugun_nm;

    @Column(name="CATE2_NM")
    private String cate2_nm;

    @Column(name="LAT")
    private String lat;

    @Column(name="LNG")
    private String lng;

    @Column(name="PLCAE")
    private String place;

    @Column(name="TITLE")
    private String title;

    @Column(name="SUBTITLE")
    private String sub_title;

    @Column(name="MAIN_PLACE")
    private String main_place;

    @Column(name="ADDR1")
    private String addr1;

    @Column(name="ADDR2")
    private String addr2;

    @Column(name="CNTCT_TEL")
    private String cntct_tel;

    @Column(name="HOMEPAGE_URL")
    private String homepage_url;

    @Column(name="TRFC_INFO")
    private String trfc_info;

    @Column(name="USAGE_DAY")
    private String usage_day;

    @Column(name="HLDY_INFO")
    private String HLDY_INFO;

    @Column(name="USAGE_DAY_WEEK_AND_TIME")
    private String usage_day_week_and_time;

    @Column(name="USAGE_AMONT")
    private String usage_amount;

    @Column(name="MIDDLE_SIZE_RM1")
    private String middle_size_rm1;

    @Column(name="MAIN_IMG_NORMAL")
    private String main_img_normal;

    @Column(name="MAIN_IMG_THUMB")
    private String main_img_thumb;

    @Column(name="ITEMCNTNTS")
    private String itemcntnts;

    @Column(name="writeDate",nullable = true)
    private String writeDate;



}
