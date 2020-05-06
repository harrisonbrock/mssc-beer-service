package com.harrisonbrock.msscbeerservice.web.controller;

import com.harrisonbrock.msscbeerservice.web.model.BeerDto;
import com.harrisonbrock.msscbeerservice.web.model.BeerStyle;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getById(@PathVariable UUID beerId) {

        System.out.println("Get Beer by id");
        // TODO: Impl
        return new ResponseEntity<>(BeerDto.builder()
                .id(beerId)
                .beerName("TesBeer")
                .beerStyle(BeerStyle.SAISON)
                .upc(null)
                .build(),
                HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity save(@Valid @RequestBody BeerDto newBeer) {

        // TODO impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity update(@PathVariable UUID beerId, @Valid @RequestBody BeerDto updateBeer) {

        // TODO impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
