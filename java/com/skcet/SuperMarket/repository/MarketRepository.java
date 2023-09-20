package com.skcet.SuperMarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.SuperMarket.model.Market;



public interface MarketRepository extends JpaRepository<Market, Long> {
}
