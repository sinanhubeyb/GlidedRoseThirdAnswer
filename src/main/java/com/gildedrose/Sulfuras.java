package com.gildedrose;

public class Sulfuras extends Item{
    public Sulfuras(String name,int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros",sellIn, quality);
    }

    @Override
    public void updateQuality() {
        //Sulfuras always same
    }
}
