package com.mintcho95.BusanPlace.Attraction.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class QueryDto {
    // 감색인자가 1개인 Dto 통합
    @Column(name="query")
    @NotBlank(message = "입력값이 필수 입니다.")
    private String query;
}
