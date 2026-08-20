package com.lilithelder.wilderdelights;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.frozenblock.wilderwild.registry.WWItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.Nullable;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class WDItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public WDItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ModTags.Items.SERVING_CONTAINERS)
                .add(ModItems.COOKED_RICE.get())
        ;
        valueLookupBuilder(WDTags.Items.Prickly_Pear_Foods)
                .add(WWItems.PRICKLY_PEAR)
                .add(WWItems.PEELED_PRICKLY_PEAR)
        ;
        valueLookupBuilder(WDTags.Items.Hibiscus)
                .add(Item.byBlock(WWBlocks.PINK_HIBISCUS))
                .add(Item.byBlock(WWBlocks.RED_HIBISCUS))
                .add(Item.byBlock(WWBlocks.PURPLE_HIBISCUS))
                .add(Item.byBlock(WWBlocks.YELLOW_HIBISCUS))
                .add(Item.byBlock(WWBlocks.WHITE_HIBISCUS))
        ;
    }
}
