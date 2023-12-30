package com.example.firstproject.api;

import com.example.firstproject.dto.PizzaDto;
import com.example.firstproject.entity.Pizza;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PizzaApiController {
    // 데이터 단건 조회
    @GetMapping("/api/pizzas/{id}")
    public ResponseEntity<PizzaDto> show(@PathVariable Long id) {
        return null;
    }
    // 데이터 목록 조회
    @GetMapping("/api/pizzas")
    public ResponseEntity<List<PizzaDto>> index() {
        return null;
    }
    // 데이터 생성
    @PostMapping("/api/pizzas")
    public ResponseEntity<PizzaDto> create(@RequestBody PizzaDto dto) {
        return null;
    }
    // 데이터 수정
    @PatchMapping("/api/pizzas/{id}")
    public ResponseEntity<PizzaDto> update(@PathVariable Long id, @RequestBody PizzaDto dto) {
        return null;
    }
    // 데이터 삭제
    @DeleteMapping("/api/pizzas/{id}")
    public ResponseEntity<PizzaDto> delete(@PathVariable Long id) {
        return null;
    }
}
