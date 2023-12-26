package com.mintcho95.BusanPlace.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name="busanCity")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BusanPlaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @NotNull
    private String gu;

    @NotNull
    private String village;
}
