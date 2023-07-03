package com.merveadler.services;

import com.merveadler.dto.request.SaveRequestDto;
import com.merveadler.mapper.IRandevuMapper;
import com.merveadler.repository.IRandevuRepository;
import com.merveadler.repository.entity.Randevu;
import com.merveadler.utility.ServiceManager;


public class RandevuService extends ServiceManager<Randevu,Long> {

    private final IRandevuRepository repository;
    public RandevuService(IRandevuRepository repository) {
        super(repository);
        this.repository=repository;
    }
    public Randevu save(SaveRequestDto dto) {
        Randevu randevu = IRandevuMapper.INSTANCE.fromSaveDto(dto);
        return repository.save(randevu);

    }
}
