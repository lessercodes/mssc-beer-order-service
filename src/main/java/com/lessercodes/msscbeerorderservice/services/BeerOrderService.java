package com.lessercodes.msscbeerorderservice.services;

import java.util.UUID;

import org.springframework.data.domain.Pageable;

import com.lessercodes.msscbeerorderservice.web.model.BeerOrderDto;
import com.lessercodes.msscbeerorderservice.web.model.BeerOrderPagedList;

public interface BeerOrderService {

    BeerOrderPagedList listOrders(UUID customerId, Pageable pageable);

    BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto);

    BeerOrderDto getOrderById(UUID customerId, UUID orderId);

    void pickupOrder(UUID customerId, UUID orderId);

}
