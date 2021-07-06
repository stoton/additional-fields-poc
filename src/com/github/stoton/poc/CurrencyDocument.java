package com.github.stoton.poc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDocument implements AdditionalTrait {

    private List<AdditionalTraitField<?>> additionalTraitFields;

    public CurrencyDocument() {
        additionalTraitFields();
    }

    @Override
    public List<AdditionalTraitField<?>> additionalTraitFields() {
        List<AdditionalTraitField<?>> additionalTraitFields = new ArrayList<>();

        AdditionalTraitField<String> currencyName = new AdditionalTraitField<>("nazwa waluty", "PLN");
        AdditionalTraitField<BigDecimal> currencyValue = new AdditionalTraitField<>("aktualna wartosc waluty w dolarach", new BigDecimal("0.23"));

        additionalTraitFields.add(currencyName);
        additionalTraitFields.add(currencyValue);

        this.additionalTraitFields = additionalTraitFields;
        return additionalTraitFields;
    }

    public List<AdditionalTraitField<?>> getAdditionalTraitFields() {
        return additionalTraitFields;
    }

    @Override
    public String toString() {
        return "CurrencyDocument{" +
                "additionalTraitFields=" + additionalTraitFields +
                '}';
    }
}
