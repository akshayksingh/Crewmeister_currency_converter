package com.crewmeister.cmcodingchallenge.serviceImpl;

import com.crewmeister.cmcodingchallenge.entity.CurrencyRates;
import com.crewmeister.cmcodingchallenge.repository.CurrencyRatesRepository;
import com.crewmeister.cmcodingchallenge.service.CurrencyRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public
class CurrencyRatesServiceImpl implements CurrencyRatesService {

  @Autowired
  private CurrencyRatesRepository currencyRatesRepository;

  @Override
  public
  CurrencyRates createNewCurrencyRates(CurrencyRates currencyRates) {
    return currencyRatesRepository.save(currencyRates);
  }

  @Override
  public
  List<CurrencyRates> getAllCurrencies() {
    return currencyRatesRepository.findAll();
  }

  @Override
  public
  List<Float> getAllExchangeRatesForDateRange(String conversionEndDate, String fx) {
    List<CurrencyRates> currencyRates =
        currencyRatesRepository.findByConversionDateBetween(dateFormatter("1999-01-01"),
            dateFormatter(conversionEndDate));
    List<Float> allRatesBetweenDates = new ArrayList<>();
    for (CurrencyRates currencyRate : currencyRates) {
      allRatesBetweenDates.add(currencyRate.getFxByName(fx));
    }
    return allRatesBetweenDates;
  }

  @Override
  public
  float getExchangeRateForDate(String conversionDate, String fx) {
    CurrencyRates currencyRatesByDate =
        currencyRatesRepository.findByConversionDate(dateFormatter(conversionDate));
    return null == currencyRatesByDate ? 0 : currencyRatesByDate.getFxByName(fx);
  }

  @Override
  public
  float getExchangedEuroForDate(String conversionDate, String fx, Long amountInFx) {
    CurrencyRates currencyRatesByDate =
        currencyRatesRepository.findByConversionDate(dateFormatter(conversionDate));
    float rate = currencyRatesByDate.getFxByName(fx);
    return rate == 0 ? 0 : amountInFx / rate;
  }

  private
  Date dateFormatter(String date) {
    try {
      return new SimpleDateFormat("yyyy-MM-dd").parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return new Date();
  }
}
