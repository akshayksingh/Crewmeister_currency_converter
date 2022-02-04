package com.crewmeister.cmcodingchallenge.repository;

import com.crewmeister.cmcodingchallenge.entity.CurrencyRates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public
interface CurrencyRatesRepository extends JpaRepository<CurrencyRates, Long> {

  CurrencyRates findByConversionDate(Date conversionDate);

  List<CurrencyRates> findByConversionDateBetween(Date start, Date end);
}
