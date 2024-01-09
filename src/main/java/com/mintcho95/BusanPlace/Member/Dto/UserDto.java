package com.mintcho95.BusanPlace.Member.Dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotNull
    @Size(min=3,max=50)
    private String username;

    @NotNull
    @Size(min=3,max=50)
    private String password;

    @NotNull
    @Size(min=3,max=50)
    private String nickname;
}
