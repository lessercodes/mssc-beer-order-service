package com.lessercodes.msscbeerorderservice.web.mappers;

import org.mapstruct.Mapper;

import com.lessercodes.msscbeerorderservice.domain.BeerOrderLine;
import com.lessercodes.msscbeerorderservice.web.model.BeerOrderLineDto;

@Mapper(uses = { DateMapper.class })
public interface BeerOrderLineMapper {

    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);

}
