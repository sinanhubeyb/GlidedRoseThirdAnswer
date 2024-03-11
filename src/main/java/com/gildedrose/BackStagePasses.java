package com.gildedrose;

public class BackStagePasses extends Item{
    public BackStagePasses(String name,int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality<50){
            quality++;
            if (sellIn<11 && quality<50){
                quality++;
            }
            if (sellIn<6 && quality <50){
                quality++;
            }
        }
        sellIn--;
        if (sellIn<0){
            quality=0;
        }

    }
}
//
//
//
//
//package com.gildedrose;
//
//public class TexttestFixture {
//    public static void main(String[] args) {
//        System.out.println("OMGHAI!");
//
//        Item[] items = new Item[] {
//            new Item("+5 Dexterity Vest", 10, 20) {
//                @Override
//                public void updateQuality() {
//
//                }
//            }, //
//            new Item("Aged Brie", 2, 0) {
//                @Override
//                public void updateQuality() {
//
//                }
//            }, //
//            new Item("Elixir of the Mongoose", 5, 7) {
//                @Override
//                public void updateQuality() {
//
//                }
//            }, //
//            new Item("Sulfuras, Hand of Ragnaros", 0, 80) {
//                @Override
//                public void updateQuality() {
//
//                }
//            }, //
//            new Item("Sulfuras, Hand of Ragnaros", -1, 80) {
//                @Override
//                public void updateQuality() {
//
//                }
//            },
//            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) {
//                @Override
//                public void updateQuality() {
//
//                }
//            },
//            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49) {
//                @Override
//                public void updateQuality() {
//
//                }
//            },
//            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) {
//                @Override
//                public void updateQuality() {
//
//                }
//            },
//            // this conjured item does not work properly yet
//            new Item("Conjured Mana Cake", 3, 6) {
//                @Override
//                public void updateQuality() {
//
//                }
//            }};
//
//        GildedRose app = new GildedRose(items);
//
//        int days = 2;
//        if (args.length > 0) {
//            days = Integer.parseInt(args[0]) + 1;
//        }
//
//        for (int i = 0; i < days; i++) {
//            System.out.println("-------- day " + i + " --------");
//            System.out.println("name, sellIn, quality");
//            for (Item item : items) {
//                System.out.println(item);
//            }
//            System.out.println();
//            app.updateQuality();
//        }
//    }
//
//}
