package com.merveadler.controller;

import com.merveadler.dto.request.SaveRequestDto;
import com.merveadler.repository.entity.Randevu;
import com.merveadler.services.RandevuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.merveadler.constants.RestApiList.*;

@RestController
@RequestMapping(RANDEVU)
@RequiredArgsConstructor
public class RandevuController {
    private final RandevuService randevuService;

    @PostMapping(SAVE)
    public Randevu save(@RequestBody @Valid SaveRequestDto dto) {
        return randevuService.save(dto);
    }

    @GetMapping(FINDALL)
    public List<Randevu> findAll() {
        return randevuService.findAll();
    }
}
