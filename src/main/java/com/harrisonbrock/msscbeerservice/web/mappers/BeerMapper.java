package com.harrisonbrock.msscbeerservice.web.mappers;

import com.harrisonbrock.msscbeerservice.domain.Beer;
import com.harrisonbrock.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
