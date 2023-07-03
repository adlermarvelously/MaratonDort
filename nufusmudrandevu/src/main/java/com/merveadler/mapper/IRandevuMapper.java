package com.merveadler.mapper;


import com.merveadler.dto.request.SaveRequestDto;
import com.merveadler.repository.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRandevuMapper {
    IRandevuMapper INSTANCE = Mappers.getMapper(IRandevuMapper.class);

    Randevu fromSaveDto(SaveRequestDto dto);


}
