package com.merveadler.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="tblrandevu")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String adSoyad;
    String adres;
    String telNo;
    Long kimlikNo;
    Long dogumTarihi;
    Long tarih;
    Long saat;
    Long durum;


}
