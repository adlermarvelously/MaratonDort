package com.merveadler.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ErrorType {
    INTERNAL_SERVER_ERROR(1000,"Bilinmeyen bir hata oluştu", HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST_ERROR(1001,"İstek formatı hatalı",HttpStatus.BAD_REQUEST),
    REGISTER_KULLANICIADI_KAYITLI(1001,"Kullanıcı adı kayıtlı. Yeni bir kullanıcı adı giriniz.",HttpStatus.BAD_REQUEST),
    NAME_IS_NULL(1001,"Ad-Soyad alanı boş geçilemez",HttpStatus.BAD_REQUEST),
    ID_NOT_FOUND(1001,"Aradığınız id'ye ait kayıt bulunamamıştır.",HttpStatus.BAD_REQUEST),
    INVALID_TOKEN(1002,"Geçersiz token",HttpStatus.BAD_REQUEST);
    int code;
    String message;
    HttpStatus httpStatus;
}
