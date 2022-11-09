package com.lessercodes.msscbeerorderservice.web.mappers;

import org.mapstruct.Mapper;

import com.lessercodes.msscbeerorderservice.domain.BeerOrder;
import com.lessercodes.msscbeerorderservice.web.model.BeerOrderDto;

@Mapper(componentModel = "spring", uses = { DateMapper.class, BeerOrderLineMapper.class })
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);

}
