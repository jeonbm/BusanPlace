package com.mintcho95.BusanPlace.Dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity(name="BusanPlace")
@Table(name="busanCity")
@Getter
@Setter
public class BusanPlaceDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @NotNull
    private String gu;

    @NotNull
    private String village;
}
