package com.crewmeister.cmcodingchallenge.currency;

import com.crewmeister.cmcodingchallenge.entity.CurrencyRates;
import com.crewmeister.cmcodingchallenge.serviceImpl.CurrencyRatesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public
class CurrencyController {

  @Autowired
  private CurrencyRatesServiceImpl currencyRatesService;

  /**
   * Create new entry in the database table CURRENCY_RATES
   */
  @PostMapping("/create/currencyRates")
  public
  ResponseEntity<CurrencyRates> createCurrencyRates(@RequestBody CurrencyRates currencyRates) {
    return new ResponseEntity<>(currencyRatesService.createNewCurrencyRates(currencyRates),
        HttpStatus.CREATED);
  }

  /**
   * UserStory1
   * Get all the currencies available in the table CURRENCY_RATES
   */
  @GetMapping("/currencies")
  public
  ResponseEntity<List<CurrencyRates>> getCurrencies() {
    List<CurrencyRates> currencyRates = currencyRatesService.getAllCurrencies();
    return new ResponseEntity<>(currencyRates, HttpStatus.OK);
  }

  /**
   * UserStory3
   * Get the currency rate by the date and foreign exchange
   */
  @GetMapping("/currencies/{conversionDate}/{fx}")
  public
  ResponseEntity<Float> getCurrencyRatesByDate(@PathVariable String conversionDate,
                                               @PathVariable String fx) {
    return new ResponseEntity<>(currencyRatesService.getExchangeRateForDate(conversionDate, fx),
        HttpStatus.OK);
  }

  /**
   * UserStory4
   * Get the exchanged value in Euro for given foreign exchange
   */
  @GetMapping("/currencies/{conversionDate}/{fx}/{amountInFx}")
  public
  ResponseEntity<Float> getCurrencyRatesByDate(@PathVariable String conversionDate,
                                               @PathVariable String fx,
                                               @PathVariable Long amountInFx) {
    return new ResponseEntity<>(
        currencyRatesService.getExchangedEuroForDate(conversionDate, fx, amountInFx),
        HttpStatus.OK);
  }

  /**
   * UserStory2
   * Get all the exchange rates between 1999-01-01 and date entered by the user along with the
   * foreign exchange
   */
  @GetMapping("/currencies/range/{conversionEndDate}/{fx}")
  public
  ResponseEntity<List<Float>> getCurrencyRatesByDateRange(@PathVariable String conversionEndDate,
                                                          @PathVariable String fx) {
    return new ResponseEntity<>(
        currencyRatesService.getAllExchangeRatesForDateRange(conversionEndDate, fx), HttpStatus.OK);
  }
}
