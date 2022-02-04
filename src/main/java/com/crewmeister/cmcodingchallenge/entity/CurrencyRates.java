package com.crewmeister.cmcodingchallenge.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public
class CurrencyRates {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long currencyId;

  @Column(unique = true)
  private Date conversionDate;

  @Column(precision = 10, scale = 5)
  private BigDecimal AUD;

  @Column(precision = 10, scale = 5)
  private BigDecimal BGN;

  @Column(precision = 10, scale = 5)
  private BigDecimal BRL;

  @Column(precision = 10, scale = 5)
  private BigDecimal CAD;

  @Column(precision = 10, scale = 5)
  private BigDecimal CHF;

  @Column(precision = 10, scale = 5)
  private BigDecimal CNY;

  @Column(precision = 10, scale = 5)
  private BigDecimal CYP;

  @Column(precision = 10, scale = 5)
  private BigDecimal CZK;

  @Column(precision = 10, scale = 5)
  private BigDecimal DKK;

  @Column(precision = 10, scale = 5)
  private BigDecimal EEK;

  @Column(precision = 10, scale = 5)
  private BigDecimal EUR;

  @Column(precision = 10, scale = 5)
  private BigDecimal GBP;

  @Column(precision = 10, scale = 5)
  private BigDecimal GRD;

  @Column(precision = 10, scale = 5)
  private BigDecimal HKD;

  @Column(precision = 10, scale = 5)
  private BigDecimal HRK;

  @Column(precision = 10, scale = 5)
  private BigDecimal HUF;

  @Column(precision = 10, scale = 5)
  private BigDecimal IDR;

  @Column(precision = 10, scale = 5)
  private BigDecimal ILS;

  @Column(precision = 10, scale = 5)
  private BigDecimal INR;

  @Column(precision = 10, scale = 5)
  private BigDecimal ISK;

  @Column(precision = 10, scale = 5)
  private BigDecimal JPY;

  @Column(precision = 10, scale = 5)
  private BigDecimal KRW;

  @Column(precision = 10, scale = 5)
  private BigDecimal LTL;

  @Column(precision = 10, scale = 5)
  private BigDecimal LVL;

  @Column(precision = 10, scale = 5)
  private BigDecimal MTL;

  @Column(precision = 10, scale = 5)
  private BigDecimal MXN;

  @Column(precision = 10, scale = 5)
  private BigDecimal MYR;

  @Column(precision = 10, scale = 5)
  private BigDecimal NOK;

  @Column(precision = 10, scale = 5)
  private BigDecimal NZD;

  @Column(precision = 10, scale = 5)
  private BigDecimal PHP;

  @Column(precision = 10, scale = 5)
  private BigDecimal PLN;

  @Column(precision = 10, scale = 5)
  private BigDecimal ROL;

  @Column(precision = 10, scale = 5)
  private BigDecimal RON;

  @Column(precision = 10, scale = 5)
  private BigDecimal RUB;

  @Column(precision = 10, scale = 5)
  private BigDecimal SEK;

  @Column(precision = 10, scale = 5)
  private BigDecimal SGD;

  @Column(precision = 10, scale = 5)
  private BigDecimal SIT;

  @Column(precision = 10, scale = 5)
  private BigDecimal SKK;

  @Column(precision = 10, scale = 5)
  private BigDecimal THB;

  @Column(precision = 10, scale = 5)
  private BigDecimal TRL;

  @Column(precision = 10, scale = 5)
  private BigDecimal TRY;

  @Column(precision = 10, scale = 5)
  private BigDecimal USD;

  @Column(precision = 10, scale = 5)
  private BigDecimal ZAR;

  public
  CurrencyRates() {
  }

  public
  CurrencyRates(Date conversionDate, BigDecimal AUD, BigDecimal BGN, BigDecimal BRL, BigDecimal CAD,
                BigDecimal CHF, BigDecimal CNY, BigDecimal CYP, BigDecimal CZK, BigDecimal DKK,
                BigDecimal EEK, BigDecimal EUR, BigDecimal GBP, BigDecimal GRD, BigDecimal HKD,
                BigDecimal HRK, BigDecimal HUF, BigDecimal IDR, BigDecimal ILS, BigDecimal INR,
                BigDecimal ISK, BigDecimal JPY, BigDecimal KRW, BigDecimal LTL, BigDecimal LVL,
                BigDecimal MTL, BigDecimal MXN, BigDecimal MYR, BigDecimal NOK, BigDecimal NZD,
                BigDecimal PHP, BigDecimal PLN, BigDecimal ROL, BigDecimal RON, BigDecimal RUB,
                BigDecimal SEK, BigDecimal SGD, BigDecimal SIT, BigDecimal SKK, BigDecimal THB,
                BigDecimal TRL, BigDecimal TRY, BigDecimal USD, BigDecimal ZAR) {
    this.conversionDate = conversionDate;
    this.AUD = AUD;
    this.BGN = BGN;
    this.BRL = BRL;
    this.CAD = CAD;
    this.CHF = CHF;
    this.CNY = CNY;
    this.CYP = CYP;
    this.CZK = CZK;
    this.DKK = DKK;
    this.EEK = EEK;
    this.EUR = EUR;
    this.GBP = GBP;
    this.GRD = GRD;
    this.HKD = HKD;
    this.HRK = HRK;
    this.HUF = HUF;
    this.IDR = IDR;
    this.ILS = ILS;
    this.INR = INR;
    this.ISK = ISK;
    this.JPY = JPY;
    this.KRW = KRW;
    this.LTL = LTL;
    this.LVL = LVL;
    this.MTL = MTL;
    this.MXN = MXN;
    this.MYR = MYR;
    this.NOK = NOK;
    this.NZD = NZD;
    this.PHP = PHP;
    this.PLN = PLN;
    this.ROL = ROL;
    this.RON = RON;
    this.RUB = RUB;
    this.SEK = SEK;
    this.SGD = SGD;
    this.SIT = SIT;
    this.SKK = SKK;
    this.THB = THB;
    this.TRL = TRL;
    this.TRY = TRY;
    this.USD = USD;
    this.ZAR = ZAR;
  }

  public
  Date getConversionDate() {
    return conversionDate;
  }

  public
  void setConversionDate(Date conversionDate) {
    this.conversionDate = conversionDate;
  }

  public
  BigDecimal getAUD() {
    return AUD;
  }

  public
  void setAUD(BigDecimal AUD) {
    this.AUD = AUD;
  }

  public
  BigDecimal getBGN() {
    return BGN;
  }

  public
  void setBGN(BigDecimal BGN) {
    this.BGN = BGN;
  }

  public
  BigDecimal getBRL() {
    return BRL;
  }

  public
  void setBRL(BigDecimal BRL) {
    this.BRL = BRL;
  }

  public
  BigDecimal getCAD() {
    return CAD;
  }

  public
  void setCAD(BigDecimal CAD) {
    this.CAD = CAD;
  }

  public
  BigDecimal getCHF() {
    return CHF;
  }

  public
  void setCHF(BigDecimal CHF) {
    this.CHF = CHF;
  }

  public
  BigDecimal getCNY() {
    return CNY;
  }

  public
  void setCNY(BigDecimal CNY) {
    this.CNY = CNY;
  }

  public
  BigDecimal getCYP() {
    return CYP;
  }

  public
  void setCYP(BigDecimal CYP) {
    this.CYP = CYP;
  }

  public
  BigDecimal getCZK() {
    return CZK;
  }

  public
  void setCZK(BigDecimal CZK) {
    this.CZK = CZK;
  }

  public
  BigDecimal getDKK() {
    return DKK;
  }

  public
  void setDKK(BigDecimal DKK) {
    this.DKK = DKK;
  }

  public
  BigDecimal getEEK() {
    return EEK;
  }

  public
  void setEEK(BigDecimal EEK) {
    this.EEK = EEK;
  }

  public
  BigDecimal getEUR() {
    return EUR;
  }

  public
  void setEUR(BigDecimal EUR) {
    this.EUR = EUR;
  }

  public
  BigDecimal getGBP() {
    return GBP;
  }

  public
  void setGBP(BigDecimal GBP) {
    this.GBP = GBP;
  }

  public
  BigDecimal getGRD() {
    return GRD;
  }

  public
  void setGRD(BigDecimal GRD) {
    this.GRD = GRD;
  }

  public
  BigDecimal getHKD() {
    return HKD;
  }

  public
  void setHKD(BigDecimal HKD) {
    this.HKD = HKD;
  }

  public
  BigDecimal getHRK() {
    return HRK;
  }

  public
  void setHRK(BigDecimal HRK) {
    this.HRK = HRK;
  }

  public
  BigDecimal getHUF() {
    return HUF;
  }

  public
  void setHUF(BigDecimal HUF) {
    this.HUF = HUF;
  }

  public
  BigDecimal getIDR() {
    return IDR;
  }

  public
  void setIDR(BigDecimal IDR) {
    this.IDR = IDR;
  }

  public
  BigDecimal getILS() {
    return ILS;
  }

  public
  void setILS(BigDecimal ILS) {
    this.ILS = ILS;
  }

  public
  BigDecimal getINR() {
    return INR;
  }

  public
  void setINR(BigDecimal INR) {
    this.INR = INR;
  }

  public
  BigDecimal getISK() {
    return ISK;
  }

  public
  void setISK(BigDecimal ISK) {
    this.ISK = ISK;
  }

  public
  BigDecimal getJPY() {
    return JPY;
  }

  public
  void setJPY(BigDecimal JPY) {
    this.JPY = JPY;
  }

  public
  BigDecimal getKRW() {
    return KRW;
  }

  public
  void setKRW(BigDecimal KRW) {
    this.KRW = KRW;
  }

  public
  BigDecimal getLTL() {
    return LTL;
  }

  public
  void setLTL(BigDecimal LTL) {
    this.LTL = LTL;
  }

  public
  BigDecimal getLVL() {
    return LVL;
  }

  public
  void setLVL(BigDecimal LVL) {
    this.LVL = LVL;
  }

  public
  BigDecimal getMTL() {
    return MTL;
  }

  public
  void setMTL(BigDecimal MTL) {
    this.MTL = MTL;
  }

  public
  BigDecimal getMXN() {
    return MXN;
  }

  public
  void setMXN(BigDecimal MXN) {
    this.MXN = MXN;
  }

  public
  BigDecimal getMYR() {
    return MYR;
  }

  public
  void setMYR(BigDecimal MYR) {
    this.MYR = MYR;
  }

  public
  BigDecimal getNOK() {
    return NOK;
  }

  public
  void setNOK(BigDecimal NOK) {
    this.NOK = NOK;
  }

  public
  BigDecimal getNZD() {
    return NZD;
  }

  public
  void setNZD(BigDecimal NZD) {
    this.NZD = NZD;
  }

  public
  BigDecimal getPHP() {
    return PHP;
  }

  public
  void setPHP(BigDecimal PHP) {
    this.PHP = PHP;
  }

  public
  BigDecimal getPLN() {
    return PLN;
  }

  public
  void setPLN(BigDecimal PLN) {
    this.PLN = PLN;
  }

  public
  BigDecimal getROL() {
    return ROL;
  }

  public
  void setROL(BigDecimal ROL) {
    this.ROL = ROL;
  }

  public
  BigDecimal getRON() {
    return RON;
  }

  public
  void setRON(BigDecimal RON) {
    this.RON = RON;
  }

  public
  BigDecimal getRUB() {
    return RUB;
  }

  public
  void setRUB(BigDecimal RUB) {
    this.RUB = RUB;
  }

  public
  BigDecimal getSEK() {
    return SEK;
  }

  public
  void setSEK(BigDecimal SEK) {
    this.SEK = SEK;
  }

  public
  BigDecimal getSGD() {
    return SGD;
  }

  public
  void setSGD(BigDecimal SGD) {
    this.SGD = SGD;
  }

  public
  BigDecimal getSIT() {
    return SIT;
  }

  public
  void setSIT(BigDecimal SIT) {
    this.SIT = SIT;
  }

  public
  BigDecimal getSKK() {
    return SKK;
  }

  public
  void setSKK(BigDecimal SKK) {
    this.SKK = SKK;
  }

  public
  BigDecimal getTHB() {
    return THB;
  }

  public
  void setTHB(BigDecimal THB) {
    this.THB = THB;
  }

  public
  BigDecimal getTRL() {
    return TRL;
  }

  public
  void setTRL(BigDecimal TRL) {
    this.TRL = TRL;
  }

  public
  BigDecimal getTRY() {
    return TRY;
  }

  public
  void setTRY(BigDecimal TRY) {
    this.TRY = TRY;
  }

  public
  BigDecimal getUSD() {
    return USD;
  }

  public
  void setUSD(BigDecimal USD) {
    this.USD = USD;
  }

  public
  BigDecimal getZAR() {
    return ZAR;
  }

  public
  void setZAR(BigDecimal ZAR) {
    this.ZAR = ZAR;
  }

  public
  float getFxByName(String fx) {
    switch (fx) {
      case "AUD":
        return getAUD().floatValue();
      case "BGN":
        return getBGN().floatValue();
      case "BRL":
        return getBRL().floatValue();
      case "CAD":
        return getCAD().floatValue();
      case "CHF":
        return getCHF().floatValue();
      case "CNY":
        return getCNY().floatValue();
      case "CYP":
        return getCYP().floatValue();
      case "CZK":
        return getCZK().floatValue();
      case "DKK":
        return getDKK().floatValue();
      case "EEK":
        return getEEK().floatValue();
      case "GBP":
        return getGBP().floatValue();
      case "GRD":
        return getGRD().floatValue();
      case "HKD":
        return getHKD().floatValue();
      case "HRK":
        return getHRK().floatValue();
      case "HUF":
        return getHUF().floatValue();
      case "IDR":
        return getIDR().floatValue();
      case "ILS":
        return getILS().floatValue();
      case "INR":
        return getINR().floatValue();
      case "ISK":
        return getISK().floatValue();
      case "JPY":
        return getJPY().floatValue();
      case "KRW":
        return getKRW().floatValue();
      case "LTL":
        return getLTL().floatValue();
      case "LVL":
        return getLVL().floatValue();
      case "MTL":
        return getMTL().floatValue();
      case "MXN":
        return getMXN().floatValue();
      case "MYR":
        return getMYR().floatValue();
      case "NOK":
        return getNOK().floatValue();
      case "NZD":
        return getNZD().floatValue();
      case "PHP":
        return getPHP().floatValue();
      case "PLN":
        return getPLN().floatValue();
      case "ROL":
        return getROL().floatValue();
      case "RON":
        return getRON().floatValue();
      case "RUB":
        return getRUB().floatValue();
      case "SEK":
        return getSEK().floatValue();
      case "SGD":
        return getSGD().floatValue();
      case "SIT":
        return getSIT().floatValue();
      case "SKK":
        return getSKK().floatValue();
      case "THB":
        return getTHB().floatValue();
      case "TRL":
        return getTRL().floatValue();
      case "TRY":
        return getTRY().floatValue();
      case "USD":
        return getUSD().floatValue();
      case "ZAR":
        return getZAR().floatValue();
      default:
        return getEUR().floatValue();
    }
  }
}
