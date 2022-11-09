package com.lessercodes.msscbeerorderservice.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lessercodes.msscbeerorderservice.domain.BeerOrderLine;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}
