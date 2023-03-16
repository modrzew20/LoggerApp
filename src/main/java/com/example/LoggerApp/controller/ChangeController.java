package com.example.LoggerApp.controller;

import com.example.LoggerApp.dto.ChangeDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/changes")
public interface ChangeController {

    @GetMapping("/{id}")
    ResponseEntity<List<ChangeDto>> getAll(@PathVariable("id") UUID shapeId);

    @PostMapping
    ResponseEntity<ChangeDto> create(@RequestBody @Valid ChangeDto changeDto);

}
