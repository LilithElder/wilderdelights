package com.lilithelder.wilderdelights;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class WDTags {
    public WDTags() {
    }

    private static TagKey<Item> commonItemTag(String path) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", path));
    }
    private static TagKey<Block> commonBlockTag(String path) {
        return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("c", path));
    }

    public static class Items {
        public static final TagKey<Item> Prickly_Pear_Foods = commonItemTag("foods/prickly_pear");
        public static final TagKey<Item> Hibiscus = commonItemTag("hibiscus");
    }

    public static class Blocks {
        public static final TagKey<Block> Hibiscus = commonBlockTag("hibiscus");
    }
}
