package com.ia;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Objects;

public class Money {
    private BigDecimal amount;
    private Currency currency;
    //constructor
    public Money(BigDecimal amount, Currency currency) {
        //isimciu valdymas - ar gavom suma - throw new ismet klaid iskart
        if(amount==null || currency==null) throw new IllegalArgumentException("amount/currency required");
        this.amount = amount.setScale(2, RoundingMode.HALF_UP); //apvalinam
        this.currency=currency;
    }
    //paduos valiute>grazins eurus
    public static Money eur(double value){
        return new Money(BigDecimal.valueOf(value), Currency.getInstance("Eur"));
    }
    public BigDecimal amount(){return amount;}
    public Currency currency(){return currency;}

    public Money plus(Money other){
        requireSameCurrency(other);
        return new Money(this.amount.add(other.amount), currency);
    }
    public Money times(double factor){
        return new Money(this.amount.multiply(BigDecimal.valueOf(factor)), currency);
    }
    public Money minus(Money other){
        requireSameCurrency(other);
        return new Money(this.amount.subtract(other.amount), currency);
    }
    private void requireSameCurrency(Money other){
        Objects.requireNonNull(other);
        if(!this.currency.equals(other.currency)) throw new IllegalArgumentException("Currency mismatch");
    }

    @Override
    public String toString() {
        return amount + " " +currency.getCurrencyCode();
    }
}