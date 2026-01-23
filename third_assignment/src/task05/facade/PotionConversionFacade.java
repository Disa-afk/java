package task05.facade;

import task05.alchemy_library.*;

import static task05.alchemy_library.Type.*;

public class PotionConversionFacade {

    public String convertPotion(String potionName, String convertTo) {
        System.out.println("PotionConversionFacade: conversion started.");

        Potion potion = new Potion(potionName);
        Type type = Type.valueOf(convertTo.toUpperCase());

        Essence sourceEssence = EssenceFactory.extract(potion);
        Essence destinationEssence;

        if (type == MANA) {
            destinationEssence = new ManaEssenceConverter();
        } else if (type == STAMINA) {
            destinationEssence = new StaminaEssenceConverter();
        } else {
            destinationEssence = new HealingEssenceConverter();
        }

        Potion portion = Extractor.extractPortion(potion, sourceEssence);
        Potion intermediateResult = Extractor.convert(portion, destinationEssence);
        Potion result = new Finalizator().fix(intermediateResult);

        System.out.println("PotionConversionFacade: conversion completed.");

        return result.getName();
    }
}
