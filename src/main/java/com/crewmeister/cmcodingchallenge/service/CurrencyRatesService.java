package com.crewmeister.cmcodingchallenge.service;

import com.crewmeister.cmcodingchallenge.entity.CurrencyRates;

import java.util.List;

public
interface CurrencyRatesService {

  CurrencyRates createNewCurrencyRates(CurrencyRates currencyRates);

  List<CurrencyRates> getAllCurrencies();

  List<Float> getAllExchangeRatesForDateRange(String conversionEndDate, String fx);

  float getExchangeRateForDate(String conversionDate, String fx);

  float getExchangedEuroForDate(String conversionDate, String fx, Long amountInFx);
}
