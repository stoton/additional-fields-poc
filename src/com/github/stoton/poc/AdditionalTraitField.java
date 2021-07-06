package com.github.stoton.poc;

public class AdditionalTraitField<T> {
    private final String fieldName;
    private final T value;

    public AdditionalTraitField(String fieldName, T value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    public String getFieldName() {
        return fieldName;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AdditionalTraitField{" +
                "fieldName='" + fieldName + '\'' +
                ", value=" + value +
                '}';
    }
}
