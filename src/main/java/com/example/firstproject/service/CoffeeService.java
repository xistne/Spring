package com.example.firstproject.service;

import com.example.firstproject.dto.CoffeeDto;
import com.example.firstproject.entity.Coffee;
import com.example.firstproject.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CoffeeService {
    @Autowired
    private CoffeeRepository coffeeRepository;

    public List<Coffee> index() {
        return coffeeRepository.findAll();
    }

    public Coffee show(Long id) {
        return coffeeRepository.findById(id).orElse(null);
    }

    public Coffee create(CoffeeDto dto) {
        Coffee coffee = dto.toEntity();
        return coffeeRepository.save(coffee);
    }

    public Coffee update(Long id, CoffeeDto dto) {
        Coffee coffee = dto.toEntity();
        log.info("id: {}, coffee: {}", coffee.getId(), coffee.toString());
        Coffee target = coffeeRepository.findById(coffee.getId()).orElse(null);
        if(target == null || id != coffee.getId()) {
            log.info("잘못된 요청! id: {}, coffee: {}", id, coffee.toString());
            return null;
        }
        target.patch(coffee);
        Coffee updated = coffeeRepository.save(target);
        return updated;
    }


    public Coffee delete(Long id) {
        Coffee target = coffeeRepository.findById(id).orElse(null);
        if(target == null) {
            return null;
        }
        coffeeRepository.deleteById(id);
        return target;
    }
}
