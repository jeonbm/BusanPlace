package com.mintcho95.BusanPlace.Like.Controller;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;

@Entity
@Table(name="attractionliketb")
public class LikeDto {

    @EmbeddedId
    private LikePK likePK;
    @CreatedDate
    private String writeDate;
}

