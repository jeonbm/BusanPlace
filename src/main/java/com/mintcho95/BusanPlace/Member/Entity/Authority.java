package com.mintcho95.BusanPlace.Member.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity // 데이터베이스의 테이블과 1:1로 매핑되는 객체
@Table(name = "authority") // 테이블명을 지정
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Authority {

    @Id
    @Column(name = "authority_name", length = 50)
    private String authorityName;
}