package com.github.stoton.poc;

import java.util.List;

public class Document {
    private String documentName;
    private List<AdditionalTrait> additionalTraits;

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public List<AdditionalTrait> getAdditionalTraits() {
        return additionalTraits;
    }

    public void setAdditionalTraits(List<AdditionalTrait> additionalTraits) {
        this.additionalTraits = additionalTraits;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentName='" + documentName + '\'' +
                ", additionalTraits=" + additionalTraits.toString() +
                '}';
    }
}
