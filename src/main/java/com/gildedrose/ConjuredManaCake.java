package com.gildedrose;

public class ConjuredManaCake extends Item{

    public ConjuredManaCake(String name, int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality>0){
            quality-=2;
        }
        sellIn--;
        if (sellIn<0 && quality>0){
            quality-=2;
        }
    }
}
