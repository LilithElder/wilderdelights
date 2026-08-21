package com.lilithelder.wilderdelights;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.frozenblock.wilderwild.references.WWBlockIds;
import net.frozenblock.wilderwild.references.WWBlockItemIds;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class WDBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public WDBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(WDTags.Blocks.Hibiscus)
                .add(WWBlockItemIds.PINK_HIBISCUS.block())
                .add(WWBlockItemIds.PURPLE_HIBISCUS.block())
                .add(WWBlockItemIds.RED_HIBISCUS.block())
                .add(WWBlockItemIds.YELLOW_HIBISCUS.block())
                .add(WWBlockItemIds.WHITE_HIBISCUS.block())
        ;
    }

}
