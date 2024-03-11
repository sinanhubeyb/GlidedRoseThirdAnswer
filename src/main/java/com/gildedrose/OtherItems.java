package com.gildedrose;

public class OtherItems extends Item {
    public OtherItems(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality > 0) {
            quality--;
        }

        sellIn--;
        if (sellIn<0 && quality >0){
            quality--;
        }
    }
}
