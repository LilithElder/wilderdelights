package com.lilithelder.wilderdelights;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.frozenblock.wilderwild.references.WWBlockItemIds;
import net.frozenblock.wilderwild.references.WWItemIds;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.frozenblock.wilderwild.registry.WWItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.Nullable;
import vectorwing.farmersdelight.common.references.ModItemIds;
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
        tag(ModTags.Items.SERVING_CONTAINERS)
                .add(ModItemIds.COOKED_RICE)
        ;
        tag(WDTags.Items.Prickly_Pear_Foods)
                .add(WWItemIds.PEELED_PRICKLY_PEAR)
                .add(WWBlockItemIds.PRICKLY_PEAR.item())
        ;
        tag(WDTags.Items.Hibiscus)
                .add(WWBlockItemIds.PINK_HIBISCUS.item())
                .add(WWBlockItemIds.RED_HIBISCUS.item())
                .add(WWBlockItemIds.PURPLE_HIBISCUS.item())
                .add(WWBlockItemIds.YELLOW_HIBISCUS.item())
                .add(WWBlockItemIds.WHITE_HIBISCUS.item())
        ;
    }
}
