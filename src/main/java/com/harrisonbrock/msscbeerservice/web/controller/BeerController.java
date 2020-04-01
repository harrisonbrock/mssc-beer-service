package com.harrisonbrock.msscbeerservice.web.controller;

import com.harrisonbrock.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getById(@PathVariable UUID beerId) {

        // TODO impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity save(@RequestBody BeerDto newBeer) {

        // TODO impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity update(@PathVariable UUID beerId, @RequestBody BeerDto updateBeer) {

        // TODO impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
