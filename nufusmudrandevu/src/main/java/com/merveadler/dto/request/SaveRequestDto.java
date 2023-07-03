package com.merveadler.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SaveRequestDto {
    @NotNull
    String userAd;
    @NotNull
    String userTelefon;
    @NotNull
    String userAdres;
    @NotNull
    Long tarih;
    @NotNull
    Long saat;

}