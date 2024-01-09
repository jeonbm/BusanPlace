package com.mintcho95.BusanPlace.Like.Controller;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
class LikePK implements Serializable {
    private String UC_SEQ;
    private String userId;
}