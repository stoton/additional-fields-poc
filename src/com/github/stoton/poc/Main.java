package com.github.stoton.poc;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Document document = new Document();

	    document.setDocumentName("cool document");
	    List<AdditionalTrait> additionalTraits = new ArrayList<>();

		additionalTraits.add(new CurrencyDocument());
		document.setAdditionalTraits(additionalTraits);

		System.out.println(document);
    }
}
